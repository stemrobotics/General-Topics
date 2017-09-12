public class Animals
{
    public static void main(String []args)
    {
        Dog myDog = new Dog("rover");
        Cat myCat = new Cat("kitty");
        Animal myAninal = new Animal("roger");

        System.out.println(myAninal.whatIsMyName());
        System.out.println(myDog.whatIsMyName());
        System.out.println(myCat.whatIsMyName());
    }
}
