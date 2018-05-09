public double computeArea( int heightInFeet, int widthInFeet )
{
      return heightInFeet * widthInFeet;
}

public double computeArea( int heightInFeet, int widthInFeet, boolean returnMeters )
{
      double area = computeArea( heightInFeet, widthInFeet );

      if ( returnMeters ) area = area * .3048;

      return area;
}
