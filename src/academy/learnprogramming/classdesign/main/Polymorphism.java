package academy.learnprogramming.classdesign.main;

import academy.learnprogramming.classdesign.*;
import academy.learnprogramming.classdesign.abstractclasses.Animal2;
import academy.learnprogramming.classdesign.interfaces.CanRun;
import academy.learnprogramming.classdesign.interfaces.HasTail;
import academy.learnprogramming.classdesign.interfaces.Rabbit2;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism{

    public static void main(String[] args) {

        //husky is an instance of interface and superclass == polymorphism
        HuskyExtendsDog husky = new HuskyExtendsDog(5);
        husky.setName("Rex");  //setName from Animal class

        DogExtendsAnimal dog = husky;  //upcasting, another reference to husky object in memory
        dog.printDetails();//now we can call associated methods

        HasTail hasTail = husky; //bc DogExtendsAnimal implements HasTail interface and husky extends that class, it also has access to interface methods and properties
                                    //reference to Husky object
        System.out.println("tailLength= " + hasTail.getTailLength());  //these methods available bc they're associated with HuskyExtendsDog:
                                                                            // DogExtendsAnimal implements HasTail, HuskyExtendsDog extends that class, so inherits all interface methods too

        CanRun canRun = husky;
        canRun.run(5);

        Animal animal = husky; //another reference to Husky object
        animal.printDetails();

        Object object = husky; //another reference to Husky object

//        animal.printName(); //will not compile bc printName method not in Animal
//        dog.printName(); //also doesn't work --this method has protected access in Animal2(?? not in Animal)

        DogExtendsAnimal myDog = (DogExtendsAnimal) animal;
        myDog.printDetails();

        Animal cat = new CatExtendsAnimal(2);  //assigning this cat to Animal, since CatExtendsAnimal a child of Animal
//        Cat myCat = cat; //will nto compile, since trying to assign type of animal to reference type of cat
        CatExtendsAnimal myCat = (CatExtendsAnimal) cat; //works w/explicit casting
        myCat.getSpeed(); //can cast myCat as instance of CatExtendsAnimal, but it's greyed out bc IntelliJ does this automatically

//        Bear bear = (Bear)"test"; //will not compile, bc string and bear not related in hierarchy
//        DogExtendsAnimal newDog = (Dog)cat; //this casting may produce class cast exception, cat can't be cast to dog bc it has a different hierarchy
                                                //dog and cat have same parent, but not in same hierarchy like Animal -- Dog -- Husky


        //NOT POLYMORPHIC:
        //bird can only be itself and Object
        Bird bird = new Bird();
        Object birdObject = bird;

        //POLYMORPHIC:
        //3 types of reference that point to same object (Eagle) in memory: eagle, bird, object
        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;  //Bird reference points to the eagle(polymorphic) object in memory
        Object eagleObject = eagle;

        List<String> list = new ArrayList<>(); //a polymorphic class, has parent and child, so can reference >2 (> itself and object)

        Animal2 rabbitAnimal = new Rabbit2();
        rabbitAnimal.printDetails(); //this will use the overridden method in Rabbit2, not the first one in Animal2
                                    //if that method called super.printDetails() the method from Animal2 would also be called
                                    //at the moment, this refers to original method, but it won't AT RUN TIME
    }
}
