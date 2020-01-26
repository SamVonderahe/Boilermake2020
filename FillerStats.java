import java.util.*;
import java.io.*;

public class FillerStats {

    LinkedList<String> fillerWords;
    LinkedList<Long> fillerTime;

    public FillerStats() {
        fillerWords = new LinkedList<String>();
        fillerTime = new LinkedList<Long>();
    }
    
    public void fillerSaid (String word, long time) {
        //call when the filler word was said
        this.fillerWords.add(word);
        this.fillerTime.add(time);
    }
    
    public void removeFiller (long wordTime) {
        //remove filler word from the lists
        int timeIndex = this.fillerTime.indexOf(wordTime);
        if (timeIndex == -1) {
            System.out.print("No filler word at the specified time.\n");
            return;
        } else {
            this.fillerWords.remove(timeIndex);
            this.fillerTime.remove(timeIndex);
            System.out.printf("Filler word at time " + wordTime + " removed.\n");
            return;
        }
    }
    
    public long getTimeAtIndex (int index) {
        //get the specified time at the index
        if (index >= this.fillerTime.size() || index < 0) {
            System.out.print("Index is not within list bounds.\n");
            return -1;
        } else {
            return this.fillerTime.get(index);
        }
    }
    
    public void printFillers() {
        //call after a recording session is done
        String firstWord = this.fillerWords.peekFirst();
        if (firstWord == null) {
            System.out.print("Good job! No filler words were said.\n");
            return;
        } else {
            int counter = 0;
            while (firstWord != null) {
                counter++;
                String saidF = this.fillerWords.removeFirst();
                long timeSaid = this.fillerTime.removeFirst();
                
                System.out.printf("You said " + saidF + " at time " + timeSaid + ".\n");
                firstWord = this.fillerWords.peekFirst();
            }
            if (counter == 1) {
                System.out.print("That's a total of 1 filler word, so close...\n");
            } else {
                System.out.printf("That's a total of " + counter + " filler words...\n");
            }
            return;
        }
    }
}

