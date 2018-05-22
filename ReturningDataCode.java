public class HelloWorld
{
    public static void main(String []args)
    {
        int z;
        
        z = myMethod();     // Integer returned from method stored in z.
        
        System.out.println("z=" + z);
        
        z = 5 + myMethod();
                
        System.out.println("z=" + z);
        
        String s;
        
        s = myMethod2();
                
        System.out.println("s=" + s);
        
        System.out.println(myMethod2());
    }
     
    // ignore the static modifier for now.
    static int myMethod()
    {
        int x = 2;
    
        return x;           // variable x only exists inside the method.
    }
    
    static String myMethod2()
    {
        return "my string";
    }
}
