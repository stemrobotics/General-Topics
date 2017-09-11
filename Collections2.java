import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class HelloWorld
{
    public static void main(String []args)
    {
        List <String>myList = new ArrayList<String>();

        myList.add("first string");
        myList.add("second string");
        myList.add("third string");
        myList.add(0, "new first string");
        myList.add("second string");

        for (ListIterator <String>it = myList.listIterator(); it.hasNext();)
            System.out.println(it.next());
       
        System.out.println("--------------------");

        for (ListIterator <String>it = myList.listIterator(myList.size()); it.hasPrevious();)
            System.out.println(it.previous());
    }
}
