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
    String filepath, check;
    int deposit;

    public User(String name, Scanner scanner) {
        this.name = name;
        filepath = "Simple_Banking\\People\\" + name + ".txt";
        System.out.println("Do you have an account in the bank?(Y/N): ");
        check = scanner.nextLine();
        if (check.equalsIgnoreCase("Y")) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            } catch (FileNotFoundException e) {
                System.out.println(
                        "the username you entered does not exist on the system you are trying to access. Make sure that the fist letters of first and last name are capital.");

            } catch (IOException e) {
                System.out.println("Something went wrong.");
            }
        } else if (check.equalsIgnoreCase("N")) {
            try (FileWriter writer = new FileWriter(filepath)) {
                System.out.println("""
                            You must deposit some money in order to create your account.
                            Please enter how much money you would like to deposit;
                        """);
                deposit = scanner.nextInt();
                writer.write(0);
            } catch (FileAlreadyExistsException r) {
                System.out.println("The name you entered already exists in the system.");
            } catch (IOException r) {
                System.out.println("Something went wrong.");
            }
        } else {
            System.out.println("Enter y or n.");
        }
    }

    String getName() {
        return this.name;
    }
}
