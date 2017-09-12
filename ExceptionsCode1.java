public class HelloWorld
{
     public static void main(String []args)
     {
        String myMessage = null;

        try
        {
            myMethod(myMessage);
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught a null pointer exception!");
        }
        catch (Exception e)
        {
            System.out.println("Caught an exception: " + e.getClass() + ": " + e.getMessage());        
        }
        finally
        {
            System.out.println("finally block always executed");
        }
    
        System.out.println("Hello World");
     }
     
     public static void myMethod(String s)
     {
         System.out.println(s.length());
     }
}
