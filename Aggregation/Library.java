package Aggregation;

public class Library {
    String name;
    int date;
    Books[] books;

    Library(String name, int date, Books[] books) {
        this.name = name;
        this.date = date;
        this.books = books;
    }

    void DisplayInfo() {
        System.out.println(name + ", " + date);
        for (Books book : books) {
            book.display();
        }
    }
}
