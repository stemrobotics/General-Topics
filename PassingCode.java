public class HelloWorld
{
    public static void main(String []args)
    {
        int area, x = 10;

        area = computeArea( 10, x );
        
        System.out.println(area);
        
        System.out.println( combineWords( "my", "program" ));
    }
     
    static int computeArea( int height, int width )
    {
        return height * width;
    }
    
    static String combineWords( String word1, String word2 )
    {
        return word1 + " " + word2;
    }
}
