package Library;

import java.util.InputMismatchException;

public class Controller {
    private View view = new View();

    public Controller() {
    }

    public void performance() {
        Books library = new Books(25);
        Book stealRat = new Book(001,
                "Steal Rat",
                "Harry Harryson",
                "Publisher&co",
                1994,
                685,
                225);
        library.addBook(stealRat);
        Book myBook = new Book(002,
                "Как приручить айтишника",
                "Me",
                "D1uka",
                1995,
                299,
                255);
        library.addBook(myBook);
        Book diy = new Book(003,
                "Do It Yourself",
                "Me",
                "Home Factory",
                2019,
                100500,
                333);
        library.addBook(diy);
        Book lordOfTheRings = new Book(004,
                "Lord of the rings",
                "J.R. Tolkien",
                "Any publisher",
                1998,
                925,
                788);
        library.addBook(lordOfTheRings);
        Book evolution = new Book(005,
                "Происхождение видов",
                "Чарльз Дарвин",
                "Джон Мюррей",
                1859,
                502,
                100000);
        library.addBook(evolution);
        view.showResult(library);
        view.showMessage(View.ENTER_PERCENT_TO_CHANGE);
        library.reprice();
        view.showResult(library);
        view.showMessage(View.ASK_AUTHOR);
        view.showResult(library.findByAuthor(Utilites.inputString()));
        view.showMessage(View.ASK_YEAR);
        view.showResult(library.findSinceYear());
    }
}
