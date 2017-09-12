public class HelloWorld
{
     public static void main(String []args)
     {
        System.out.println("area=" + computeArea(10, 10));
        System.out.println("area=" + computeArea(10, 10, false));
        System.out.println("area(m)=" + computeArea(10, 10, true));
     }

    public static double computeArea( int heightInFeet, int widthInFeet )
    {
          return heightInFeet * widthInFeet;
    }
    
    public static double computeArea( int heightInFeet, int widthInFeet, boolean returnMeters )
    {
          double area = computeArea( heightInFeet, widthInFeet );
    
          if ( returnMeters ) 
          {
              area = area * .3048;
          }
    
          return area;
    }
}
