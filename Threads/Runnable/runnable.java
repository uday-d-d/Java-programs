class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable is running");
    }
}

class runnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}