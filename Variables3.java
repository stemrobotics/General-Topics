public class ConstantExample
{
    int INCHES_IN_FOOT = 12;

    public double calculateInches (double lengthInFeet)
    {
        return lengthInFeet * INCHES_IN_FOOT ;
    }
    
    // Calculates the area in square inches of a square with side length ‘lengthInFeet’ 

    public double calculateSquareInches (double lengthInFeet)
    {
        return (lengthInFeet * INCHES_IN_FOOT) * (lengthInFeet * INCHES_IN_FOOT);
    }
}
