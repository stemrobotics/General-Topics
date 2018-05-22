public class HelloWorld
{
    public static void main(String []args)
    {
        Dog myDog = new Dog();

        myDog.bark();

        myDog = new Dog("collie");

        myDog.bark();

        myDog = new Dog("collie", "Lassie");

        myDog.bark();
    }
    
    public static class Dog
    {
        public String breed, name = "";

        public Dog()
        {
            breed = "";
        }

        public Dog(String breed)
        {
            this.breed = breed;
        }
      
        public Dog(String breed, String dogName)
        {
            this.breed = breed;
            name = dogName;
        }

        public void bark()
        {
            System.out.println("My " + breed + " " + name + " is barking!");
        }
    }
}
