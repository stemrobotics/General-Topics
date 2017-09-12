public class HelloWorld
{

     public static void main(String []args)
     {
        System.out.println("WHILE statement examples.");
        
        int k = 0, x = 0, y = 0, z = 0;
        
        while ( z < 10 ) z += 1;             // z is incremented repeatedly as long as z is less than 10.

        System.out.println("1 z=" + z + " it should be 10.");      
        
        z = 0;
        
        while ( z < 10 )
        {
            z += 1;                          // z and k are incremented repeatedly as long as z is less than 10.
            k += 2;
        }

        System.out.println("2 k=" + k + " it should be 20.");
 
        while ( x < 5 )
        {
            if ( x == 3 ) break;            // while should stop when x is 3.
            x += 1;
        }

        System.out.println("3 x=" + x + " it should be 3.");
        
        x = y = 0;
        
        while ( y < 10 )
        {
            y++;
            if ( x == 3) continue;          // while should run 10 times but x should
            x += 1;                         // only be incremented 3 times.
        }

        System.out.println("4 x=" + x + " it should be 3. y=" + y + " it should be 10.");
     }
}
