package threading;

public class Sample extends Thread{
    public static void main(String[] args) {
        Sample thread = new Sample();
        thread.start();
        System.out.println("This code is outside of the thread");
        System.out.println("From main " + Thread.currentThread().getName());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("From runnable " + Thread.currentThread().getName());
                for(int i= 0;i<5; i++)
                    System.out.println();
            }
        };
        runnable.run();
    }
    public void run() {
        System.out.println("This code is running in a thread");
        System.out.println("From run " + Thread.currentThread().getName());
    }
}
