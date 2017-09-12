public class Dog extends Animal
{
    public boolean licensed;

    public Dog(String name)
    {
        super(name);                 // Invoke superclass constructor.
    }

    public void bark()
    {
        System.out.println(super.name + " says BARK!");
    }
}
