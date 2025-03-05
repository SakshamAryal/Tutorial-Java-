package Simple_Banking;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare variables
        String name;
        float money = 0;
        int input = 0;
        String activity = null;

        // user object
        System.out.print("Enter the name of the user: ");
        name = scanner.nextLine();
        User user = new User(name, scanner);
        name = user.getName();

        // // transaction object
        // Transaction transaction = new Transaction(name, activity, money);

        while (input != 5) {
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show transaction history.");
            System.out.println("5. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice (1-5): ");
            input = scanner.nextInt();

            // if (input == 1) {
            // transaction.display_balance();
            // }
        }
        // if name is not present, give the option to create a new account - done in
        // user
        // present options such as deposit, withdraw, check balance and view
        // transactions

    }
}
