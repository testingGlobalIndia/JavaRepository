package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ===");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println("Hello from anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            public void run(){
                System.out.println("Hello from My runnable thread class");
            }
        });
        myRunnableThread.start();

        anotherThread.interrupt();


        System.out.println("Hello again from the main thread");

    }
}
