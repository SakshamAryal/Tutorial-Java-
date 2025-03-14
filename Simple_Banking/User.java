package Simple_Banking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class User {
    private String name;
    String filepath1, filepath2, check;
    double deposit;

    public User(String name, Scanner scanner) {
        this.name = name;
        filepath1 = "Simple_Banking\\People\\" + name + ".txt";
        filepath2 = "Simple_Banking\\Transacion_History\\" + name + "_history.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath1))) {
        } catch (FileNotFoundException e) {
            System.out.println(
                    "the username you entered does not exist on the system you are trying to access. Make sure that the fist letters of first and last name are capital.");

            System.out.print("Do you want to create a new account?(Y/N): ");
            check = scanner.nextLine();
            if (check.equalsIgnoreCase("y")) {
                try (FileWriter writer = new FileWriter(filepath1)) {
                    writer.write("Balance: ");
                    System.out.println("You must deposit some money in order to create your account.");
                    System.out.print("Please enter the amount you want to deposit: ");
                    deposit = scanner.nextDouble();
                    scanner.nextLine();
                    new Transaction(name, "new", deposit);
                } catch (FileAlreadyExistsException r) {
                    System.out.println("The name you entered already exists in the system.");
                } catch (IOException r) {
                    System.out.println("Something went wrong.");
                }
            } else if (check.equalsIgnoreCase("n")) {
                System.out.println("Thank you! Have a good day.");
                System.exit(2);
            } else {
                System.out.println("Enter y or n.");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }

    }

    String getName() {
        return this.name;
    }
}
