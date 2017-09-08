public class Animal
{
    public String name;
    public int age;

    public Animal()
    {
    }

    public Animal(String name)
    {
        this.name = name;
    }
}

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

public class Animals
{
    public static void main(String []args)
    {
        Dog myDog = new Dog("rover");
        myDog.age = 3;

        Cat myCat = new Cat("kitty", 3);
        myCat.age = 1;               // Change the age field from 3 to 1.

        myDog.licensed = true;
        myCat.isPersian = true;

        myDog.bark();
        myCat.meow();

        System.out.println("My dog " + myDog.name + " is " + myDog.age + " years old");

        Animal myAnimal = new Animal("roger");
        myAnimal.age = 5;

        myAnimal.bark();            // Fails since bark is not part of Animal.
    }
}
