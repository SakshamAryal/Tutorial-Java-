package Simple_Banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import java.util.Calendar;

public class Transaction {
    double amount, balance = 0;
    String filepath2, activity;
    FileWriter writer2;

    Transaction(String name, String activity, double amount) {
        filepath2 = "Simple_Banking\\Transaction_History\\" + name + "_history.txt";
        this.amount = amount;
        this.activity = activity;
        Calendar calendar = Calendar.getInstance();

        try (FileWriter writer2 = new FileWriter(filepath2)) {

            if (this.activity.equalsIgnoreCase("deposit")) {
                balance += this.amount;
                writer2.write("(" + calendar.getTime() + ") $" + balance + " was deposited into the account");
            } else if (this.activity.equalsIgnoreCase("withdraw")) {
                balance -= this.amount;
                writer2.write("(" + calendar.getTime() + ") $" + balance + " was withdrawn from the account");
            }
        } catch (FileAlreadyExistsException r) {
            System.out.println("The name you entered already exists in the system.");
        } catch (IOException r) {
            System.out.println("Something went wrong.");
        }
        // try(BufferedReader reader = new BufferedReader(new FileReader(filepath2))){

        // }

    }

    void display_balance() {
        System.out.println("You have $" + balance + " in your account.");

    }

    void deposit(double amount_deposited) {
        balance += amount_deposited;
    }

}
