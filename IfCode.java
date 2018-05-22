public class HelloWorld
{
     public static void main(String []args)
     {
        int x = 0, y = 0, z = 0, k = 0;
         
        if ( x == y ) z = 9;     // x and y are equal so the boolean result is                            true and the statement is executed.
        System.out.println("z=" + z);

        z = 0;
        
        if ( x == y )
            z = 9;               // This is the same as above, the single                             statement can be on the next line.
        System.out.println("z=" + z);

        z = 0;
        
        if ( x == y )            // The two statements in the block are executed.
        {
            z = 9;
            z = x + 3;
        }
    
        System.out.println("z=" + z);

        if ( x < -1) y = 2;     // x is not greater than -1 (it is zero) so the                              statement is not executed.
        System.out.println("y=" + y);

        x = y = z = 0;
        
        if ( x == y )
            z = 7;                // This statement is executed.
        else
            z = 0;
        
        System.out.println("z=" + z);

        if ( x != y )
            z = 7;
        else
            z = 0;                // This statement is executed.
        
        System.out.println("z=" + z);

        if ( x == 0 )
        {
            z = 99;               // This statement block is executed
            k = 33;
        }
        else
        {
            z++;
            k += 2;
        }
        
        System.out.println("z=" + z + "  k=" + k);

        x = y = z = 0;
        
        if ( x == 2 )
            z = 5;
        else if ( y == 0 ) 
            z = 2;              // This statement is executed.
        
        System.out.println("z=" + z);

        z = 0;
        
        if ( x == 2 )
            z = 5;
        else if ( y == 1 ) 
            z = 2;              // Neither statement is executed, both boolean results are false.
        
        System.out.println("z=" + z);

        // You can also do:

        z = 0;
        
        if ( x == 9 )
            z = 5;
        else if ( y == 9 ) 
            z += 2;
        else                    // Neither of the above comparisons are true so this else is excuted.
            z = 9;  
           
        System.out.println("z=" + z);
     }
}
