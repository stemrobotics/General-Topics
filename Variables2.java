public class ConstantExample
{
    public double calculateInches (double lengthInFeet)
    {
        return lengthInFeet * 12 ;
    }

    // Calculates the area in square inches of a square with side length ‘lengthInFeet’ 

    public double calculateSquareInches (double lengthInFeet)
    {
        return (lengthInFeet * 12) * (lengthInFeet * 12);
    }
}
