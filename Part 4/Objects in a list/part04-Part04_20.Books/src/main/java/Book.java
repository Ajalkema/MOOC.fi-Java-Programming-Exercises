public class Book {
    private String title;
    private int numOfPages;
    private int yearOfPub;

    public Book(String title, int numOfPages, int yearOfPub) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.yearOfPub = yearOfPub;
    }

    public String getTitle() {
        return this.title;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    public int getYearOfPub() {
        return this.yearOfPub;
    }

    public String toString() {
        return this.title + ", " + this.numOfPages + " pages, " + this.yearOfPub;
    }
}
