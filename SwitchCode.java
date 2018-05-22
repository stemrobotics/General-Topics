public class HelloWorld
{
    public static void main(String[] args)
    {
        String  day = "monday", dayName;
        int     dayNumber;
        
        switch ( day )
        {
            case "monday":
                dayNumber = 1;
                break;

            case "tuesday":
                dayNumber = 2;
                break;

            case "wednesday":
                dayNumber = 3;
                break;

            default:
                dayNumber = 0;
        }
        
        switch ( dayNumber )
        {
            case 1:
                dayName = "monday";
                break;

            case 2:
                dayName = "tuesday";
                break;

            case 3:
                dayName = "wednesday";
                break;

            default:
                dayName = "unknown";
        } 
        
        System.out.println("dayNumber=" + dayNumber + "  dayName=" + dayName);
    }
}
