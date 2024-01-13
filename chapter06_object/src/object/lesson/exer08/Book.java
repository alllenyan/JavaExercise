package object.lesson.exer08;

public class Book {

    private String book;
    private String author;
    private double price;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showInfo(){
        return "BookName is " + book + ", Author is " + author + ", Price is " + price;
    }
}
