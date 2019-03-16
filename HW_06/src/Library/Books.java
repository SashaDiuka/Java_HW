package Library;

public class Books {
    private Book[] books;
    private int index = -1;

    public Books() {
    }

    public Books(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index == books.length - 1) {
            System.out.println("Library is full");
        } else {
            books[++index] = book;
        }
    }

    public void showLibrary() {
        if (index < 0) {
            System.out.println("Library is emty");
        } else {
            for (int i = 0; i <= index; i++) {
                books[i].view();
                System.out.println();
            }
        }
    }

    public void reprice(int perscent) {
        for (int i = 0; i <= index; i++) {
            int cost = books[i].getCost();
            cost = cost + (cost / 100 * perscent);
            books[i].setCost(cost);
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


    public Books findByAuthor(String author) {
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
            System.out.println("There is no book of this author");
            return new Books(0);
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

    public Books findSinceYear(int year) {
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
            System.out.println("There are no books since this year");
            return new Books(0);
        }
    }
}






