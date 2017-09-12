public class Cat extends Animal
{
    public boolean isPersian;

    public Cat(String name, int age)
    {
        super(name);
        super.age = age;             // Access superclass field.
    }

    public void meow()
    {
        System.out.println(super.name + " says MEOW!");
    }
}
