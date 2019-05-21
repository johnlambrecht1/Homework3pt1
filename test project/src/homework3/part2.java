package homework3;

public class part2 extends Thread {
    public void run(){
        int count = 0;
        while (true){
            count++;
            System.out.println("    "+count);
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                return;
            }
        }
    }
    public void myinterrupt() throws InterruptedException{
        Thread.sleep(3000);
    }
}
