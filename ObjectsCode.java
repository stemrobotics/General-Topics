public class HelloWorld
{
     public static void main(String []args)
     {
        Dog myDog = new Dog();            // myDog isn't a primitive, its an instance of class Dog.
        
        myDog.breed = "collie";
        myDog.name = "Lassie";
        myDog.age = 5;
        
        myDog.bark();

        System.out.println("My dog is a " + myDog.breed + " named " + myDog.name + " and is " +
                           myDog.age + " years old.");

        Dog herDog = new Dog();
        herDog.breed = "sheperd";
        herDog.name = "Fido";
        herDog.bark();

        System.out.println("My dog is named " + myDog.name + " and her dog is named " + herDog.name);   

        Dog2 myDog2 = new Dog2("Lassie");

        myDog2.setBreed("collie");

        myDog2.bark();

        System.out.println("My dog is named " + myDog2.getName());
     }
}
