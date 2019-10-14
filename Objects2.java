Dog myDog = new Dog();            // myDog isn't a primitive variable, its a reference
                                  // variable pointing to the new instance of class Dog.
myDog.breed = "collie";           // Here we set the instance fields via direct access.
myDog.name = "Lassie";
myDog.age = 5;

myDog.bark();                     // Execute the method bark.

System.out.println("My dog is a " + myDog.breed + " named " + myDog.name +
                   " and is " + myDog.age + " years old.");

This prints out:

The collie Lassie is barking!
My dog is a collie named Lassie and is 5 years old.
