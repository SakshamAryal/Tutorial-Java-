package Simple_Banking;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Transaction {
    static double amount_deposited, balance = 0, amount_withdrawn;
    static String filepath2;
    String name = new User.getName();

    Transaction(String name, String status) {
        filepath2 = "Simple_Banking\\Transaction_History\\" + name + "_history.txt";
        try (FileWriter writer2 = new FileWriter(filepath2)) {
        } catch (FileAlreadyExistsException r) {
            System.out.println("The name you entered already exists in the system.");
        } catch (IOException r) {
            System.out.println("Something went wrong.");
        }
    }

    static void deposit(double amount_deposited) {
        balance += amount_deposited;
    }

}
