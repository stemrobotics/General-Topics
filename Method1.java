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
          
         x = myMethod2(x);
         
          System.out.println("Hello World! " + x);
     }
     
     public static int myMethod2(int number)
     {
          return number * 5;
     }
}
