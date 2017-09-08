public class Animal
{
    public String name;

    public Animal(String name)
    {
        this.name = name;
    }
    public string whatIsMyName()
    {
        return("I am an Animal named " + name);
    }
}
public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);                 
    }

    public string whatIsMyName()
    {
        return("I am a Dog named " + super.name);
    }
}

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public String whatIsMyName()
    {
        return("I am a Cat and " + super.whatIsMyName());
    }
}

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
