package EpamJavaTrainee.Tasks.Library.Books;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sing {
    Path usersFile = Paths.get("C:\\IT\\testDirectory\\usersFile.txt");

    public void registration () throws IOException, NoSuchAlgorithmException {
        List<String> list = new ArrayList<>();
        System.out.println("Для регистрации ");
        List<String> users = Files.readAllLines(usersFile);

            System.out.println("Введите логин ");
            String login = new Scanner(System.in).nextLine();
            for (int i = 0; i < users.size(); i++) {
                if(login.equals(users.get(i))){
                    System.out.println("Этот логин уже существует, попробуйте снова!");
                    registration();
                    break;
                }
            }

        list.add(login) ;
        System.out.println("Введите пароль: ");
        String pass = new Scanner(System.in).nextLine();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String newPass = "";
        byte[] bytes = md5.digest(pass.getBytes());
        for (byte b: bytes
             ) {
            newPass += b;
        }
        list.add(newPass);
        System.out.println("Ваш аккаунт зарегестрирован");
        Files.write(usersFile, list,StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
    public void tryEnter () throws IOException, NoSuchAlgorithmException {
        System.out.println("Для входа в аккаунт");
        System.out.println("Введите логин: ");
        String login = new Scanner(System.in).nextLine() ;
        System.out.println("Введите пароль: ");
        String pass = new Scanner(System.in).nextLine();
        List<String> users = Files.readAllLines(usersFile);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String newPass = "";
        byte[] bytes = md5.digest(pass.getBytes());
        for (byte b: bytes
        ) {
            newPass += b;
        }

        for (int i = 0; i < users.size(); i++) {
            if(login.equals(users.get(i))){
                if(newPass.equals(users.get(i+1))){
                    System.out.println("Вы вошли в систему под логином: " + login);
                    break;
                } else {
                    System.out.println("Неверный логин или пароль попробуйте снова ");
                    tryEnter();
                }
            }
            if(i == users.size()-1 && !login.equals(users.get(i))){
                System.out.println("Логин не найден, попробуйте снова");
                tryEnter();
            }
        }

    }
}
