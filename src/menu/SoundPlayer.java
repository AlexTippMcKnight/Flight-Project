package menu;

import java.io.*;
import javax.sound.sampled.*;
import logging.AssignmentLogger;

public class SoundPlayer {
    /**
     * Plays a sound file given the file path as a string. Uses Java's built-in audio capabilities to read and play the sound file, with error handling for unsupported audio formats, IO exceptions and line unavailability.
     * @param sound
     */
    public static void playSound(String sound) {
        AssignmentLogger.logStaticMethodEntry();
        try{
            File file = new File(sound);
            file.toURI();

            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file.toURI().toURL());
            Clip clip = AudioSystem.getClip();

            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
        AssignmentLogger.logStaticMethodExit();
    }
}
