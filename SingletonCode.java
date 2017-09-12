public class HelloWorld
{

     public static void main(String []args)
     {
        System.out.println("Hello World");

        MySingleton ms1, ms2, ms3;

        ms1 = MySingleton.getInstance();
        ms2 = MySingleton.getInstance();
        ms3 = MySingleton.getInstance();

        System.out.println(ms1.instanceCount);
        System.out.println(ms2.instanceCount);
        System.out.println(ms3.getInstanceCount());
     }
}
