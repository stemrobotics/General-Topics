public double computeArea( double heightInFeet, double widthInFeet )
{
    return heightInFeet * widthInFeet;
}

public double computeArea( double heightInFeet, double widthInFeet, boolean returnMeters )
{
    double area = computeArea( heightInFeet, widthInFeet );

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
