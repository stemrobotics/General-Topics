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
