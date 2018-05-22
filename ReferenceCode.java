public class HelloWorld
{
     public static void main(String []args)
     {
        String myStr = "abc", myStr3;

        myMethod(myStr);
        
        System.out.println("myStr=" + myStr);
        
        StringBuffer mySB = new StringBuffer("abc");
      
        myMethod1(mySB);
                
        System.out.println("mySB=" + mySB);
      
        myMethod2(mySB);
                
        System.out.println("mySB=" + mySB);
        
        myStr = "abc";
        
        myStr3 = myMethod3(myStr);
        
        // \n in a println string moves to a new line.
        System.out.println("\nmyStr=" + myStr);
        System.out.println("myStr3=" + myStr3);
     }

    public static void myMethod( String str )
    {
        str = str + "xyz";
        System.out.println("\n  str=" + str);
    }

    public static void myMethod1( StringBuffer sb )
    {
        sb.append( "xyz" );
        System.out.println("\n  sb=" + sb);

    }
    
    public static void myMethod2( StringBuffer sb )
    {
        sb = new StringBuffer( "123");
        sb.append("456");
        System.out.println("\n  sb=" + sb);

    }
    
    public static String myMethod3( String str )
    {
         str = str + "xyz";
         return str;
    }
}
