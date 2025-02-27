import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewriteread {
    public static void main(String[] args) {

        String file = "test.txt";
        String write = "Hello world!";
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(write);
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file location.");
        } catch (IOException e) {
            System.out.println("Could not write file.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            System.out.println("The file exists");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file location.");

        } catch (IOException e) {
            System.out.println("Could not write file.");
        }

    }
}
