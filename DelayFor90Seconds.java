import java.io.*;
import java.lang.Thread;

class DelayFor90Seconds {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
            if (i == 1) {
                System.out.println("Delaying for ====>  " + i + " second");
            } else
            {
                System.out.println("Delaying for ====>  " + i + " seconds");
            }
        }
    }
}