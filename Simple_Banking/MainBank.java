package Simple_Banking;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare variables
        String name;
        float money;

        // ask for name
        System.out.print("Enter the name of the user: ");
        name = scanner.nextLine();

        User user = new User(name, scanner);
        // if name is not present, give the option to create a new account - done in
        // user
        // present options such as deposit, withdraw, check balance and view
        // transactions

    }
}
