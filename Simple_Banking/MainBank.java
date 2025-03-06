package Simple_Banking;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare variables
        String name;
        double money = 0;
        int input = 0;

        // user object
        System.out.print("Enter the name of the user: ");
        name = scanner.nextLine();
        User user = new User(name, scanner);
        name = user.getName();

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

            switch (input) {
                case (1):
                    new Transaction(name, "balance", 0);
                    break;
                case (2):
                    System.out.print("How much do you want to deposit? ");
                    money = scanner.nextDouble();
                    scanner.nextLine();
                    new Transaction(name, "deposit", money);
                    break;
                case (3):
                    System.out.print("How much do you want to withdraw? ");
                    money = scanner.nextDouble();
                    scanner.nextLine();
                    new Transaction(name, "withdraw", money);
                    break;
                case (4):
                    new Transaction(name);
                case (5):
                default:
                    break;
            }
        }
        System.out.println("Thank you! Have a nice day.");

    }
}
