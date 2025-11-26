class EvenThread extends Thread {
    public void run(){
        for(int i = 2;i<=20;i+=2){
            System.out.println("Even Number: "+i);
        }
    }
}

class OddThread extends Thread {
    public void run(){
        for(int i = 1;i<=20;i+=2){
            System.out.println("Odd Number: "+i);
        }
    }
}

public class setpriority {
    public static void main(String[] srgs){
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.setPriority(Thread.MIN_PRIORITY);
        odd.setPriority(Thread.MAX_PRIORITY);

        even.start();
        odd.start();
    }
}
