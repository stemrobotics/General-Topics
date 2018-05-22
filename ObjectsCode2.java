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
        herDog.breed = "shepherd";
        herDog.name = "Fido";
        herDog.bark();

        System.out.println("My dog is named " + myDog.name + " and her dog is named " + herDog.name);   

        Dog2 myDog2 = new Dog2("Lassie");

        myDog2.setBreed("collie");

        myDog2.bark();

        System.out.println("My dog is named " + myDog2.getName());
     }
     
    public static class Dog
    {
      public String breed, name;  // each dog instance will have two string variables: breed and name.
      public int    age;          // each dog instance also has an integer variable: age.

      public void bark()
      {
            System.out.println("The " + breed + " " + name + " is barking!");
      }
    }
    
    public static class Dog2
    {
        private String breed, name;

        Dog2(String name)
        {           
            this.name = name;       
        }

        public void setBreed(String name)
        {
            breed =  name;
        }

        public String getBreed()
        {
            return breed;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void bark() 
        { 
            System.out.println("My " + breed + " " + name + " is barking!"); 
        }
    }
}
