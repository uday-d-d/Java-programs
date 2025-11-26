class SharedBuffer{
    private int data;
    private boolean available = false;

    public synchronized void produce(int value){
        while(available){
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }
        data = value;
        available = true;
        System.out.println("Producer : "+ value);
        notify();
    }

    public synchronized void consume(){
        while(!available){
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }
        System.out.println("Consumer : " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread{
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        buffer.produce(100);
    }
}

class Consumer extends Thread{
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        buffer.consume();
    }
}

public class ProducerConsumerSimple {

    public static void main(String[] args){
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
    
        producer.start();
        consumer.start();
    }

}
