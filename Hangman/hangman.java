package Hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                 /|\\
                """;
        Error[4] = """
                  O
                 /|\\
                 /
                """;
        Error[5] = """
                  O
                 /|\\
                 / \\
                """;

        System.out.println("""

                Welcome to HANGMAN GAME
                let's play the game
                """);

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
        // iterate over input
        while (numOfGuess < 6) {
            for (String iterate : display) {
                System.out.print(iterate);
            }
            System.out.println("""

                    """);
            if (wordToguess.contentEquals(display.toString())) {
                System.out.println("You won");
                break;
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextLine();
            guess = guess.substring(0, 1);
            // check and display hangman
            if (wordToguess.contains(guess.toUpperCase()) || wordToguess.contains(guess.toLowerCase())) {

                System.out.println(guess + " is present ");
                for (int j = 0; j < size; j++) {
                    String compare = wordToguess.substring(j, j + 1);
                    if (compare.equalsIgnoreCase(guess)) {
                        display.set(j, compare);
                    }
                }
            } else {
                numOfGuess += 1;
                switch (numOfGuess) {
                    case (1):
                        System.out.println(Error[0]);
                        break;
                    case (2):
                        System.out.println(Error[1]);
                        break;
                    case (3):
                        System.out.println(Error[2]);
                        break;
                    case (4):
                        System.out.println(Error[3]);
                        break;
                    case (5):
                        System.out.println(Error[4]);
                        break;
                    case (6):
                        System.out.println(Error[5]);
                        break;
                }
            }
            i++;
        }

        if (wordToguess.equalsIgnoreCase(display.toString())) {
            System.out.println("You won");
        } else {
            System.out.println("The word to guess was " + wordToguess);
        }

        scanner.close();

    }
}
