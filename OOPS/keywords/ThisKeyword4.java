class Book {
    String title;
    int price;

    Book() {
        this("Unknown", 0);  // calling parameterized constructor
    }
// Constructor chaining using this()
    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class ThisKeyword4 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.show();

        Book b2 = new Book("DSA Guide", 500);
        b2.show();
    }
}
