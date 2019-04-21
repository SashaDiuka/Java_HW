package Library;

public class View {
    static final String ASK_YEAR = "Enter year, please";
    static final String ASK_AUTHOR = "Enter author, please";
    static final String EMPTY_SEARCH_RESULT = "There is no book, which meets your criteria";
    static final String FULL_LIBRARY = "Library is full";
    static final String EMPTY_LIBRARY = "Library is empty";
    static final String ENTER_PERCENT_TO_CHANGE = "Enter percent to change";
    static final String INCORRECT_INPUT = "You entered invalid data.\nPlease, try again\n";

    public void showResult(Books library) {
        System.out.println(library.toString());
    }

    public void showResult(Book book) {
        System.out.println(book.toString());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showErrMessage(String message) {
        System.err.println(message);
    }
}