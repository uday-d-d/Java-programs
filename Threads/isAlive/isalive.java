class IsaliveThread extends Thread{
    public void run(){
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class isalive {
    public static void main(String[] args){
        IsaliveThread isalive = new IsaliveThread();
        isalive.start();

        if(isalive.isAlive()){
            System.out.println("Thread is alive");
        }
        else{
            System.out.println("Thread is not alive");
        }
    }
}
