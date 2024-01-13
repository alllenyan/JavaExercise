package object.lesson.exer08;

public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setBook("与傻逼的沟通技巧");
        book1.setAuthor("Fucking Who");
        book1.setPrice(200.0);

        System.out.println(book1.showInfo());
    }
}
