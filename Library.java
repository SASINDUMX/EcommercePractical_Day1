class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class PrintedBook extends Book{
    private int pages;
    public PrintedBook(String title, String author, int pages){
        super(title, author);
        this.pages = pages;
    }

    public int getPages(){
        return pages;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
    }
}

class EBook extends Book {
    private double fileSize; // File size in MB

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class AudioBook extends Book {
    private double duration; // Duration in hours

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " hours");
    }
}

public class Library {
    public static void main(String[] args) {

        Book printedBook = new PrintedBook("A", "A. ABC", 218);
        Book eBook = new EBook("B", "B. BCD", 1.5);
        Book audioBook = new AudioBook("C", "CDE", 19.2);

        Book[] books = {printedBook, eBook, audioBook};

        System.out.println("Library Book Details:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println("----------------------------");
        }
    }
}