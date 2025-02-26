package Aggregation;

public class Books {

    String name, author;

    Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    void display() {
        System.out.println(name + ", " + author);
    }

}
