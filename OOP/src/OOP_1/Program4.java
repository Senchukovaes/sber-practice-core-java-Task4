package OOP_1;

public class Program4 {
    public static void main(String[] args) {
    Author a1 = new Author("Andzhey Sapkovskiy", "man", "Andzh556@gmail.com");
    System.out.println(a1.getEmail());
    Author a2 = new Author("Agatha Christie", "woman", "Christie22@mail.ru");
    a2.toString(a2);
    System.out.println();

    Book b1 = new Book("Appointment with Death", a2, 0000);
    b1.setYear(1938);
    System.out.println(b1.getYear());
    b1.toString(b1);
    Book b2 = new Book("-", a1, 0000);
    b2.setTitle("The last wish");
    b2.setYear(1993);
    b2.toString(b2);
    }
}

class Author {
    String name;
    String sex;
    String email;
    Author(String s1, String s2, String s3){
        this.name = s1;
        this.sex = s2;
        this.email = s3;
    }
    void setName(String n) {
        name = n;
    }
    void setSex(String s) {
        sex = s;
    }
    void setEmail(String e) {
        email = e;
    }
    String getName() {
        return name;
    }
    String getSex() {
        return sex;
    }
    String getEmail() {
        return email;
    }
    void toString(Author a) {
        System.out.println("Информация об авторе "+ a.name);
        System.out.println("Имя: " + name);
        System.out.println("Пол: " + sex);
        System.out.println("Почта: " + email);
    }
}

class Book {
    String title;
    Author author;
    int year;
    Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    void setTitle(String t) {
        title = t;
    }
    void setAuthor(Author a) {
        author = a;
    }
    void setYear(int y) {
        year = y;
    }
    String getTitle() {
        return title;
    }
    Author getAuthor() {
        return author;
    }
    int getYear() {
        return year;
    }
    void toString(Book b) {
        System.out.println("Информация о книге "+ b.title);
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author.name);
        System.out.println("Год создания: " + year);
    }
}