public double computeArea( double lengthInFeet, double widthInFeet )
{
    return lengthInFeet * widthInFeet;
}

public double computeArea( double lengthInFeet, double widthInFeet, boolean returnMeters )
{
    double area = computeArea( lengthInFeet, widthInFeet );

    if ( returnMeters ) area = area * .3048;

    return area;
}

public static void main(String []args)
{
    double  h = 10, w=10;
    
    System.out.println("area=" + computeArea(10, 10));
    System.out.println("area=" + computeArea(h, 10, false));
    System.out.println("area(m)=" + computeArea(h, w, true));
}
