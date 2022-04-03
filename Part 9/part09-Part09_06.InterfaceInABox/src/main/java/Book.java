public class Book implements Packable {
    private String name;
    private String author;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.author + ": " + this.name;
    }
}
