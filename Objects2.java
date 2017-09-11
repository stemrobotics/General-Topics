Dog myDog = new Dog();            // myDog isn't a primitive, its an instance of class Dog.
myDog.breed = "collie";
myDog.name = "Lassie";
myDog.age = 5;

myDog.bark();

System.out.println("My dog is a " + myDog.breed + " named " + myDog.name +
                   " and is " + myDog.age + " years old.");
