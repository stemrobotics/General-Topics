public class HelloWorld
{
     enum DayOfWeek
     {
         SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
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
     }
}
