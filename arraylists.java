import java.util.ArrayList;
import java.util.Scanner;

public class arraylists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Fruits = new ArrayList<>();

        Fruits.add("Blueberry");
        Fruits.add("Apple");
        Fruits.add("Orange");

        Fruits.remove(2);
        Fruits.set(1, "Strawberry");

        for (String fruit : Fruits) {
            System.out.println(fruit);
        }

        System.out.print("How many more fruits do you want to add? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {

            System.out.print("Fruit no." + (i + 1) + ": ");
            String add = scanner.nextLine();
            Fruits.add(add);
        }

        System.out.println(Fruits);

        scanner.close();

    }
}
