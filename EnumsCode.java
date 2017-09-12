public class HelloWorld
{
     enum DayOfWeek
     {
         SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
     }
     
     enum DayOfWeekExtended
     {
         SUNDAY(0), MONDAY(1), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
         
         public final int dayNumber;
         
         DayOfWeekExtended(int day)
         {
             dayNumber = day;
         }
         
         public int getDayNumber() { return dayNumber; }
     }
     
     public static void main(String []args)
     {
        DayOfWeek day = DayOfWeek.TUESDAY;
        
        System.out.println("day value is " + day + " and I can do this " + DayOfWeek.TUESDAY);
        
        switch (day)
        {
            case MONDAY:
                System.out.println("day = Monday");
                break;
                
            case TUESDAY:
                System.out.println("day = Tuesday");
                break;
                
            case WEDNESDAY:
                System.out.println("day = Wednesday");
                break;
                        
        }

        DayOfWeekExtended dayx = DayOfWeekExtended.TUESDAY;
        
        System.out.println("\ndayx value is " + dayx + " and I can do this " + DayOfWeekExtended.TUESDAY);
        
        switch (dayx)
        {
            case MONDAY:
                System.out.println("dayx = Monday");
                break;
                
            case TUESDAY:
                System.out.println("dayx = Tuesday");
                break;
                
            case WEDNESDAY:
                System.out.println("dayx = Wednesday");
                break;
                        
        }
        
        System.out.println("The dayx number is " + dayx.dayNumber + " and " + dayx.getDayNumber());
   }
}
