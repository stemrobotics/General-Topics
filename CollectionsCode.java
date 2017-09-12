import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class HelloWorld
{
    public static void main(String []args)
    {
        Set <String>mySet = new HashSet<String>();

        mySet.add("first string");
        mySet.add("second string");
        mySet.add("third string");
        mySet.add("first string");
        
        for (String s: mySet) System.out.println(s);
            
        List <String>myList = new ArrayList<String>();

        myList.add("first string");
        myList.add("second string");
        myList.add("third string");
        myList.add(0, "new first string");
        myList.add("second string");
        
        System.out.println("--------------------");
        
        for (ListIterator <String>it = myList.listIterator(); it.hasNext();)
            System.out.println(it.next());
        
        System.out.println("--------------------");

        for (ListIterator <String>it = myList.listIterator(myList.size()); it.hasPrevious();)
            System.out.println(it.previous());
    }
}
