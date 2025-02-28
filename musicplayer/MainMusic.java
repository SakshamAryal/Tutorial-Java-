package musicplayer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MainMusic {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Dell\\Documents\\GitHub\\Tutorial-Java-\\musicplayer\\MUSIC.wav";
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            int i = 0;

            while (i != 4) {
                System.out.print("Enter (1) to start, (2) to pause, (3) to reset and (4) to exit: ");
                i = scanner.nextInt();
                scanner.nextLine();

                switch (i) {
                    case (1):
                        clip.start();
                        break;
                    case (2):
                        clip.stop();
                        break;
                    case (3):
                        clip.setFramePosition(0);
                        // clip.start();
                        break;
                    case (4):
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file.");
        } catch (LineUnavailableException e) {
            System.out.println("Unreachable file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Bye!");
        }
    }

}
