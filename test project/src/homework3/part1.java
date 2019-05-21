package homework3;

import java.util.concurrent.*;
public class part1 extends Thread{
    public void run(){
        int count = 0;
        while (true){
            count++;
            System.out.println( count);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }

    public static void main(String[] args)throws InterruptedException{
        (new part1()).start();
        (new part2()).start();
    }
}
