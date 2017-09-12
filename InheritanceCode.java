public class HelloWorld
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

        System.out.println("My Dog " + myDog.name + " is " + myDog.age + " years old");
        System.out.println("My Cat " + myCat.name + " is " + myCat.age + " years old");

        Animal myAnimal = new Animal("roger");
        myAnimal.age = 5;

        myAnimal.bark();            // Fails since bark is not part of Animal.
                                    // Comment out to compile.
        PrintAnimal(myDog);
        PrintAnimal(myCat);
        PrintAnimal(myAnimal);
     }
     
     public static void PrintAnimal(Animal animal)
     {
        System.out.println("My " + animal.getClass().getName() + " " + animal.name + " is " + animal.age + " years old");
     }
}
