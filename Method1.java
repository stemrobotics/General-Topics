public class HelloWorld
{
     public static void main(String []args)
     {
        myMethod();
        myMethod();
     }

     public static void myMethod()
     {
         int x = 3;
         x = x * 5;
         System.out.println("Hello World! " + x);
     }    
}
