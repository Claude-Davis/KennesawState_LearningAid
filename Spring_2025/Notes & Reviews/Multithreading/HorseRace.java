import java.util.*;
public class HorseRace implements Runnable{
    public static int HorseID = 0;
    public int HorseNum;
    public int location;

    public Horse(){
        HorseID++;
        HorseNum = HorseID;
        location=0;
    }

    public void run(){
        Random r = new Random();

        while (location < 50){
            int sleepTime=r.nextInt(10)*100; //random number between 0-10 is chosen, then multiplied by 100
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException x){
                location++;
            }
        }
    }

    public void printHorse(){
        for (int i=0; i<location; i++){
            System.out.println();
        }
    }
}
