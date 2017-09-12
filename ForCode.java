public class HelloWorld
{
    public static void main(String []args)
    {
        System.out.println("FOR loop examples");
            
        for ( int i = 1; i < 4; i++ ) System.out.println( "Count is: " + i );
    
        // This statement will cause a compile error because i is local to the
        // for statement and not available outside of it. Comment out the next
        // line to compile and run the example.
        System.out.println("Final i is:" + i);
        
        int j;
    
        for ( j = 1 ; ; )
        {
            System.out.println( "Count is: " + j );
            if ( j == 3) break;
            j++;
        }

        // We can use j because it is defined in the same scope as the println.
        System.out.println("Final j is:" + j);
    }
}
