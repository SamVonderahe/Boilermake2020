package com.mycompany.ehhsistant;
import java.util.*;
import java.io.*;
public class Speech {
    File audioFile;
    JavaSoundRecorder player;
    Timer tim;
    //FillerStats fillers;
    String notes;
    ArrayList<Long> checkpoints = new ArrayList<Long>();
    boolean interrupt_playback = false;

    public Speech() {

    }
    public Speech(String file_name,String notes) {
      this.notes = notes;
      this.audioFile = new File(file_name);
      if (this.audioFile.exists()) {
        //Ask if they want to override
      }
      this.player = new JavaSoundRecorder(this.audioFile);
    }
    public void record() {
      Thread try_this = new Thread(new Runnable() {
            public void run() {
                  try {
                    player.record();
                  }
                  catch (Exception e) {

                  }
             }
           });
     try_this.start();

    }
    public void stopRecording() {
        player.stopRecording();
    }
    public void addCheckpoint() {
      checkpoints.add(tim.get_time());
    }
    public void removeCheckpoint(long time) {
      checkpoints.remove(time);
    }
    public void playback() {
    interrupt_playback = false;
      MakeSound sound = new MakeSound();
      this.tim = new Timer();
      Thread start_playback = new Thread(new Runnable() {
            public void run() {
            sound.playSound(audioFile, tim);
                  try {
                    Thread.sleep(100);
                  }
                  catch (Exception e) {

                  }
               }
           });
      start_playback.start();
      if (interrupt_playback) {
          sound.interrupt = true;
      }
    }
    public void stop_playback() {
      interrupt_playback = true;
    }
}
