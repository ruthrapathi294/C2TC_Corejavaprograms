package ruthra.assignment3;

public class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Book: [ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author + "]");
    }
    public String toString() {
    	return getTitle() + " by " + author;
    }
}
