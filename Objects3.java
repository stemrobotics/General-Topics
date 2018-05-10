Dog myDog = new Dog();
myDog.breed = "collie";
myDog.name = "Lassie";
myDog.bark();

Dog herDog = new Dog();
herDog.breed = "shepherd";
herDog.name = "Fido";
herDog.bark();

System.out.println("My dog is named " + myDog.name + " and her dog is named " + herDog.name + ".");

This prints out:

The collie Lassie is barking!
The shepherd Fido is barking!
My dog is named Lassie and her dog is named Fido.
