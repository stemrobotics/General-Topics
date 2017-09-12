public class HelloWorld
{
    volatile static int i = 0;

    public static void main(String []args) throws Exception
    {
        int time = 0;
        
        MyThread t = new MyThread();

        t.start();

        while (time < 20)
        {
            System.out.println("i=" + i);

            Thread.sleep(500);
            time +=1;
        }

        t.interrupt();

        System.out.println("main thread done");
    }

    private static class MyThread extends Thread
    {
         public void run()
         {
             try
             {
                 while (!isInterrupted())
                 {
                     i = i + 1;

                     Thread.sleep(1000);
                 }
             }
             catch (InterruptedException e) {System.out.println(e.getMessage());}
             catch (Exception e) {System.out.println(e.toString());}
         }
    }
}
