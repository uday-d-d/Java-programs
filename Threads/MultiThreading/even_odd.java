class EvenThread extends Thread{
    public void run(){
        for(int i=2;i<=10;i+=2){
                System.out.println("Even: "+i);
        }
    }
}

class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i+=2){
            System.out.println("Odd: "+i);
        }
    }
}

public class even_odd {
    public static void main(String[] args){
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
    
        evenThread.setPriority(Thread.MIN_PRIORITY);
        oddThread.setPriority(Thread.MAX_PRIORITY);
    
        oddThread.start();
        evenThread.start();
    }
}
