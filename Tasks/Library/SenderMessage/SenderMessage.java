package EpamJavaTrainee.Tasks.Library.SenderMessage;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
public class SenderMessage {
    public static void main(String[] args) {


        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.myisp.com");
        Session session = Session.getDefaultInstance(properties, null);


        String to = "newsm0k@mail.ru";    
        String from = "itisfunny4x@gmail.com";
        String subject = "Hello";
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(from));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            msg.setSubject(subject);
            msg.setText("Hi,\n\nIt's my message");

            // Send the message.
            Transport.send(msg);
        } catch (MessagingException e) {
            // Error.
        }
    }
}
