package Hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // file creation
        String Pathname = "Hangman\\Word.txt";
        File Word = new File(Pathname);
        int replace = 0;

        try (FileWriter writer = new FileWriter(Word)) {
            writer.write("""
                    Wukong
                    Inception
                    Polaroid
                    Controller
                    Fan""");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Please input a word.");
        }

        // variable declaration
        String guess = null;
        int numOfGuess = 0, size;
        String wordToguess;
        ArrayList<String> Words = new ArrayList<>(), display = new ArrayList<>();

        String[] Error = new String[6];
        Error[0] = """
                  O
                """;
        Error[1] = """
                  O
                  |
                """;
        Error[2] = """
                  O
                 /|
                """;
        Error[3] = """
                  O
                 /|\
                """;
        Error[4] = """
                  O
                 /|\
                 /
                """;
        Error[5] = """
                  O
                 /|\
                 / \
                """;

        System.out.println("""
                Welcome to HANGMAN GAME
                let's play the game""");

        // read the file and gather words
        try (BufferedReader read = new BufferedReader(new FileReader(Pathname))) {
            String line;
            while ((line = read.readLine()) != null) {
                Words.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }

        wordToguess = Words.get(random.nextInt(0, Words.size()));
        size = wordToguess.length();
        int i = 0;
        while (i < size) {
            display.add("_");
            i++;
        }

        while (numOfGuess < 6) {
            System.err.println(display.toString());
            if (wordToguess.contentEquals(display.toString())) {
                System.out.println("You won");
                break;
            }
            System.out.println("Enter your guess.");
            guess = scanner.nextLine();
            // check
            if (wordToguess.contains(guess)) {
                for (int j = 0; j < size; j++) {
                    replace = wordToguess.indexOf(guess, replace);
                    display.set(replace, guess);
                }
            } else {
                numOfGuess += 1;
                System.err.println("You have " + (6 - numOfGuess) + "tries remaining");
            }
            replace = 0;
            i++;
        }

        if (wordToguess.contentEquals(display.toString())) {
            System.out.println("You won");
        } else {
            System.out.println("The word to guess was " + wordToguess);
        }

    }
}
