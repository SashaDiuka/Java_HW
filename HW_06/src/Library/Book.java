package Library;

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

    public void view() {
        System.out.println("ID:" + id);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("The year of edition: " + editionYear);
        System.out.println("Pages: " + numberOfPages);
        System.out.println("Cost: " + cost + " UAH");
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
}
