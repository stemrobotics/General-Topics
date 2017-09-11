import java.util.Set;
import java.util.HashSet;

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
    }
}
