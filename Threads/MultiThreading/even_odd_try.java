class Even extends Thread{
    public void run(){
        for(int i=2;i<=20;i+=2){
            System.out.println("Even: "+i);

        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        }
    }
}

class Odd extends Thread{
    public void run(){
        for(int i=1;i<=20;i+=2){
            System.out.println("Odd: "+i);

        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        }
    }
}

public class even_odd_try {
    public static void main(String[] args){
        Even evenThread = new Even();
        Odd oddThread = new Odd();

        evenThread.start();
        oddThread.start();
    }
}
