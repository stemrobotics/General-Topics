Dog myDog = new Dog();

myDog.bark();

myDog = new Dog("collie");

myDog.bark();

myDog = new Dog("collie", "Lassie");

myDog.bark();

This prints out:

My  is barking!
My collie  is barking!
My collie Lassie is barking!
  
// Note, we can also do this:

Dog myDog = new Dog();

myDog.name = "Lassie";
myDog.breed = "Collie";

// This works because breed and name have public
// access so we can use the dot to change them.
// If they were private variables, we would have
// to use a constructor to initialize them.
