public class Dog
{
      public String breed, name;

      public Dog()
      {
            breed = "";
            name = "";
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
