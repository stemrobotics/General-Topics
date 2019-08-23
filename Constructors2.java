public class Dog
{
      public String breed, name = "";

      // name is initialized explicitly above to an empty string.
      // Below, a constructor method initializes breed the same way.
      // These two ways to initialize variables are equivalent.
      
      public Dog()
      {
            breed = "";
      }

      // This constructor allows us to set the breed to whatever we
      // want when we create a Dog instance with the new keyword.
      
      public Dog(String breed)
      {
            this.breed = breed;
      }
      
      // This constructor allows us to set both breed and name on
      // the new keyword.
      
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
