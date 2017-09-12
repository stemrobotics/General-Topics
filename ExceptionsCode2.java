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
        //catch (MyException e)
        //{
        //    System.out.println(e.toString());
        //}
        catch (Exception e)
        {
            System.out.println("Caught an exception: " + e.toString());        
        }
        finally
        {
            System.out.println("finally block always executed");
        }
    
        System.out.println("Hello World");
     }
     
     public static void myMethod(String s) throws Exception
     {
         throw new Exception("test exception");
         //throw new MyException("My custom exception");
     }
}
