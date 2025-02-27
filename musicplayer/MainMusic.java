package musicplayer;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MainMusic {

    public static void main(String[] args) {
        String fileName = "MUSIC.wav";
        File file = new File(fileName);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            System.out.println("File found!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (LineUnavailableException e) {

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }

}
