package Library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Books library = new Books(25);
        Book stealRat = new Book(001, "Steal Rat", "Harry Harryson", "Publisher&co", 1994, 685, 225);
        library.addBook(stealRat);
        Book myBook = new Book(002, "Как приручить айтишника", "Me", "D1uka", 1995, 299, 255);
        library.addBook(myBook);
        Book diy = new Book(003, "Do It Yourself", "Me", "Home Factory", 2019, 100500, 333);
        library.addBook(diy);
        Book lordOfTheRings = new Book(004,"Lord of the rings","J.R. Tolkien","Any publisher",1998,925,788);
        library.addBook(lordOfTheRings);
        Book evolution = new Book(005,"Происхождение видов","Чарльз Дарвин","Джон Мюррей",1859,502,100000);
        library.addBook(evolution);
        library.showLibrary();
        System.out.println("Enter percent to change cost");
        library.reprice(inputInt());
        System.out.println("Enter author");
        library.findByAuthor(inputString()).showLibrary();
        System.out.println("Enter start year");
        library.findSinceYear(inputInt()).showLibrary();
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
