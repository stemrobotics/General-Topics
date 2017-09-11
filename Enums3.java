public class HelloWorld
{
     enum DayOfWeek
     {
         SUNDAY(0), MONDAY(1), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

         public final int dayNumber;

         DayOfWeek(int day)
         {
             dayNumber = day;
         }

         public int getDayNumber() { return dayNumber; }
     }

     public static void main(String []args)
     {
        DayOfWeek day = DayOfWeek.TUESDAY;

        System.out.println("day value is " + day + " and I can do this " + DayOfWeek.TUESDAY);

        System.out.println("The day number is " + day.dayNumber + " and " + day.getDayNumber());
     }
}
