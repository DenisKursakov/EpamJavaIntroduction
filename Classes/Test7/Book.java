package EpamJavaTrainee.Classes.Test7;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int page;
    private int price;
    private String binding;
    public String toString(){
        return id + " " + name + " " + author + " " + publishingHouse + " " + yearOfPublication + " " + page + " " + price + " " + binding ;
    }
    public Book(int id, String name, String author, String publishingHouse, int yearOfPublication, int page, int price, String binding) {
        setId(id);
        setName(name);
        setAuthor(author);
        setPublishingHouse(publishingHouse);
        setYearOfPublication(yearOfPublication);
        setPage(page);
        setPrice(price);
        setBinding(binding);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }
    public void searchAuthor(Book[] books){
        System.out.println("Введите имя Автора: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equals(s)){
                System.out.println(books[i].toString());
            }
        }
    }
    public void searchP(Book[] books) {
        System.out.println("Введите название издательства: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishingHouse.equals(s)) {
                System.out.println(books[i].toString());
            }
        }
    }
    public void searchYear(Book[] books){
        System.out.println("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            if(books[i].yearOfPublication > t){
                System.out.println(books[i].toString());
            }
        }
    }
}
