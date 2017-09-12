public class HelloWorld
{
     public static void main(String []args)
     {
        MyClass instance1 = new MyClass();
        MyClass instance2 = new MyClass();

        instance1.theVar = 3;
        instance2.theVar = 7;

        System.out.println(instance1.toString() + "   " + instance2.toString());
     
        System.out.println("instance count=" + MyClass2.getTheCount());

        MyClass2 instance3 = new MyClass2();
        MyClass2 instance4 = new MyClass2();

        MyClass2.globalCount++;

        System.out.println("instance count=" + MyClass2.getTheCount());

        MyClass2.theVar++;
     }
}
