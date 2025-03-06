package Simple_Banking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Calendar;

public class Transaction {
    double amount, balance;
    String filepath2, activity, filepath1;
    FileWriter writer2;

    // constructor
    Transaction(String name, String activity, double amount) {
        filepath2 = "Simple_Banking\\Transaction_History\\" + name + "_history.txt";
        filepath1 = "Simple_Banking\\People\\" + name + ".txt";
        // get balance
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.substring(line.indexOf("$") + 1);
                balance = Double.parseDouble(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
        this.amount = amount;
        this.activity = activity;
        Calendar calendar = Calendar.getInstance();

        if (activity.equalsIgnoreCase("balance")) {
            System.out.println("You have $" + balance + " in your account.");
        }
        // if creating a new account
        if (this.activity.equalsIgnoreCase("new")) {
            File user = new File(filepath2);
            try (FileWriter writer2 = new FileWriter(user)) {
                balance += this.amount;
                writer2.write("(" + calendar.getTime() + ") $" + balance + " was deposited into the account.\n");
            } catch (IOException r) {
                System.out.println("Something went wrong.");
            }
        }

        // writing transactions
        else {
            try (FileWriter writer2 = new FileWriter(filepath2, true)) {

                if (this.activity.equalsIgnoreCase("deposit")) {
                    balance += this.amount;
                    writer2.write("(" + calendar.getTime() + ") $" + balance + " was deposited into the account.\n");
                } else if (this.activity.equalsIgnoreCase("withdraw")) {
                    if (balance < this.amount) {
                        System.out.println("You dont have sufficient funds.");
                    } else {
                        balance -= this.amount;
                        writer2.write(
                                "(" + calendar.getTime() + ") $" + balance + " was withdrawn from the account.\n");
                    }

                }
            } catch (FileAlreadyExistsException e) {
                System.out.println("The name you entered already exists in the system.");
            } catch (IOException e) {
                System.out.println("Something went wrong.");
            }
        }

        // updated balance
        try (FileWriter writer1 = new FileWriter(filepath1)) {
            writer1.write("Balance: $" + balance);
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }

    }

    Transaction(String name) {
        filepath2 = "Simple_Banking\\Transaction_History\\" + name + "_history.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }

}
