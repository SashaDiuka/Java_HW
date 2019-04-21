package Library;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Comparator;


public class Books {
    private Book[] books;
    private int index = -1;
    private View view = new View();

    public Books() {
    }

    public Books(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index == books.length - 1) {
            view.showErrMessage(View.FULL_LIBRARY);
        } else {
            books[++index] = book;
        }
    }

    public void reprice() {
        try {
            int perscent = Utilites.inputInt();
            for (int i = 0; i <= index; i++) {
                books[i].reprise(perscent);
            }
        } catch (InputMismatchException e) {
            view.showErrMessage(View.INCORRECT_INPUT);
            reprice();
        }
    }

    public int countBooks(String author) {
        int listSize = 0;
        for (int i = 0; i <= index; i++) {
            if (books[i].getAuthor().equals(author)) {
                listSize++;
            }
        }
        return listSize;
    }

    public Books findByAuthor() {
        try {
            String author = Utilites.inputString();
            int listSize = countBooks(author);
            if (listSize > 0) {
                Books list = new Books(listSize);
                for (int i = 0; i <= index; i++) {
                    if (books[i].getAuthor().equals(author)) {
                        list.addBook(books[i]);
                    }
                }
                return list;
            } else {
                view.showMessage(View.EMPTY_SEARCH_RESULT);
                return new Books(0);
            }
        } catch (InputMismatchException e) {
            view.showErrMessage(View.INCORRECT_INPUT);
            return findByAuthor();
        }
    }

    public int countBooks(int year) {
        int listSize = 0;
        for (int i = 0; i <= index; i++) {
            if (books[i].getEditionYear() > year) {
                listSize++;
            }
        }
        return listSize;
    }

    public Books findSinceYear() {
        try {
            int year = Utilites.inputInt();
            Validator validator = new Validator();
            validator.inputValidateByYear(year);
            int listSize = countBooks(year);
            if (listSize > 0) {
                Books list = new Books(listSize);
                for (int i = 0; i <= index; i++) {
                    if (books[i].getEditionYear() >= year) {
                        list.addBook(books[i]);
                    }
                }
                return list;
            } else {
                view.showMessage(View.EMPTY_SEARCH_RESULT);
                return new Books(0);
            }
        } catch (InputMismatchException e) {
            view.showErrMessage(View.INCORRECT_INPUT);
            return findSinceYear();
        }
    }

    @Override
    public String toString() {
        if (index < 0) {
            return View.EMPTY_LIBRARY;
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i <= index; i++) {
                result.append("\n");
                result.append(books[i].toString());
                result.append("\n");
            }
            return result.toString();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books1 = (Books) o;
        return index == books1.index &&
                Arrays.equals(books, books1.books);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index);
        result = 31 * result + Arrays.hashCode(books);
        return result;
    }

    private String viewBooks(Book[] array, int index) {
        StringBuilder result = new StringBuilder();
        result.append("Sorted library:\n");
        for (int i = 0; i < index; i++) {
            result.append("\n" + array[i] + "\n");
        }
        return result.toString();
    }

    public String sortByName(){
        Book[] newBooks = Arrays.copyOf(books, index);
        Arrays.sort(newBooks, new Comparator<Book>() {
            @Override
            public int compare(Book one, Book two) {
                return one.getName().compareTo(two.getName());
            }
        });
        return viewBooks(newBooks, index);
    }
}