public class Main extends Thread
{
    public static void main(String[] args)
    {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thrad");
        }
        public void run()
    {
        System.out.println("This thread is running in a tread");
    }
}

