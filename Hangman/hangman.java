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

public class hangman {

    public static void main(String[] args) {

        Random random = new Random();
        // file creation
        String Pathname = "B:\\java\\Tutorial Java\\Hangman\\Word.txt";
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
        Character guess;
        int numOfGuess = 0, size;
        String wordToguess;
        ArrayList<String> Words = new ArrayList<>();

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
        while (numOfGuess < 7) {
            System.out.println();
        }

    }
}
