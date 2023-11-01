public class Main implements Runnable
{
    public static void main(String[] args)
    {
        Main thread1 = new Main();
        thread t1 = new Thread (thread1);
        t1.start();
        Main thread2 = new Main();
        thread t2 = new Thread (thread2);
        t2.start();
        System.out.println("This cose is outside of the thread");
    }
    public void run()
    {
        System.out.println("This code is running in a thread");
    }
}
