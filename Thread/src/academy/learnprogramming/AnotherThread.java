package academy.learnprogramming;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println("Hello from "+currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException ex){
            System.out.println("I am interupted by another thread");
        }
    }
}
