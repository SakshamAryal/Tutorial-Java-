import java.util.Scanner;

public class Banking_Program {

    // printing balance
    static void print(double a) {
        System.err.println("***************");
        System.out.printf("$%.2f%n", a);
    }

    // adding money
    static double add(double a, Scanner b) {
        double change, amount;
        System.out.print("Enter an amount to be deposited: ");
        change = b.nextDouble();
        amount = a + change;
        return amount;
    }

    static double deduct(double a, Scanner b) {
        double withdrawal, amount;
        System.out.print("Enter an amount to withdraw: ");
        withdrawal = b.nextDouble();
        amount = a - withdrawal;
        return amount;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare variables
        double balance = 0;
        int loop = 0;

        // add a loop to repeat everything\
        while (loop != 4) {
            System.err.printf("%n***************%n");
            System.out.println("BANKING PROGRAM");
            System.err.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.err.println("***************");

            System.out.print("Enter your choice(1 - 4): ");
            loop = scanner.nextInt();

            System.out.printf("%n");

            switch (loop) {
                case (1):
                    print(balance);
                    break;
                case (2):
                    balance = add(balance, scanner);
                    break;
                case (3):
                    balance = deduct(balance, scanner);
                    break;
                case (4):
                    break;
                default:
                    System.out.println("Enter a number between 1-4. %n");
            }
        }
        scanner.close();
    }

}
