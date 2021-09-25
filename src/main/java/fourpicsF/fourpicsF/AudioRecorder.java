package fourpicsF.fourpicsF;

import javafx.concurrent.Task;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class AudioRecorder
{
    private Clip  clip;
    public AudioRecorder() {
        try {
            clip=AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public  void playRecord(String Path){
        try{
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        clip .close();
                        AudioInputStream inputStream=AudioSystem.getAudioInputStream(new File(Path));
                        clip.open(inputStream);
                        clip.start();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public  void playLoopedRecord(String Path){
        try{
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        clip .close();
                        AudioInputStream inputStream=AudioSystem.getAudioInputStream(new File(Path));
                        clip.open(inputStream);
                        clip.loop(5);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void close() {
        clip.close();
    }

}
