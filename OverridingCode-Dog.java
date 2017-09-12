public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);                 
    }

    public String whatIsMyName()
    {
        return("I am a Dog named " + super.name);
    }
}
