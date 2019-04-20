package Library;

import java.util.Objects;

class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int editionYear;
    private int numberOfPages;
    private int cost;

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, int editionYear, int numberOfPages, int cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.editionYear = editionYear;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void reprise(int percent) {
        cost = cost + (int) ((double) ((cost / 100)) * percent);
    }

    @Override
    public String toString() {
        return "Book " +
                "id: " + id +
                "\nname: '" + name + '\'' +
                "\nauthor: '" + author + '\'' +
                "\npublisher: '" + publisher + '\'' +
                "\neditionYear: " + editionYear +
                "\nnumberOfPages: " + numberOfPages +
                "\ncost: " + cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                editionYear == book.editionYear &&
                numberOfPages == book.numberOfPages &&
                cost == book.cost &&
                name.equals(book.name) &&
                author.equals(book.author) &&
                publisher.equals(book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publisher, editionYear, numberOfPages, cost);
    }
}