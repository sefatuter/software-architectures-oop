package com.arc.oop.inheritance;

import com.arc.oop.inheritance.model.Animal;
import com.arc.oop.inheritance.model.Cat;
import com.arc.oop.inheritance.model.Chicken;
import com.arc.oop.inheritance.model.Dog;
import com.arc.oop.inheritance.model_two.A;

public class Main {
    public static void main(String[] args) {

        // INHERITANCE
        // Saves rewriting methods and variables defined in parent classes.

        Dog dog = new Dog();

        dog.age = 10; // age comes from Animal class.
        dog.animalName = "Ice";

        dog.writeName(dog.animalName);

        System.out.println("------------------------------");

        Animal animal = new Animal();

        animal.age = 15;
        animal.animalName = "Lucky";

        animal.writeName(animal.animalName);


        /*
        1- More than one class can inherit a class. But a class can inherit only one. Like Dog class can inherit from Animal only but not "Animal, Dog" together, only one inherit.
        2- Protected, can be accessed from both the class it is in and within the class that inherits that class. At main inaccessible
        3- Constructors
        4- this, super and super()
        5- Method override
        */
//        Animal.numberOfFeet  // Can't accessible because it's protected.

        System.out.println("------------------------------");
        A aObject = new A(); // Automatically goes A's constructor
        // Goes to the inherited constructive method --> So it's first write C's constructor then B and A.

        System.out.println("------------------------------");
        A aObject2 = new A(5,8);  // When called with parameter.

        System.out.println("------------------------------");
//        aObject2.aClassMethod();
        System.out.println("B Variable 1: " + aObject2.bVar1);
        System.out.println("B Variable 2: " + aObject2.bVar2);

        System.out.println("------------------------------");

        Cat cat = new Cat();
        cat.giveVoice(); // Method override

        System.out.println("------------------------------");

        Dog dog2 = new Dog();
        dog2.giveVoice(); // Method override

        /*
        When an object is derived from the Cat class and the giveVoice() method is used,
        the overridden method in the Cat method will be used,
        not the method in the Animal class.
         */

        System.out.println("------------------------------");

        Chicken chicken = new Chicken();
        chicken.giveVoice();

    }
}
