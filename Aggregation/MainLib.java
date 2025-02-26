package Aggregation;

public class MainLib {

    public static void main(String[] args) {
        Books book1 = new Books("The kite runner", "Khaled Hosseini");
        Books book2 = new Books("Norwegian Wood", "Haruki Murakami");

        Books[] books = { book1, book2 };

        Library library = new Library("Toronto Public Library", 1883, books);

        library.DisplayInfo();
    }

}
