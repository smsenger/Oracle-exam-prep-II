package academy.learnprogramming.classdesign.main;

import academy.learnprogramming.classdesign.CatExtendsAnimal;
import academy.learnprogramming.classdesign.DogExtendsAnimal;
import academy.learnprogramming.classdesign.HuskyExtendsDog;
import academy.learnprogramming.classdesign.abstractclasses.Snake2;
import academy.learnprogramming.classdesign.interfaces.Bear;
import academy.learnprogramming.classdesign.interfaces.Rabbit2;
import academy.learnprogramming.classdesign.interfaces.Snake3;

public class MainDogExtensionClass {

    public static void mainDogExtends() {
        //super(); //calls constructor in parent class --> here it calls DogExtendsAnimal constructor, gets called automatically if parent class has no argument constructor
        HuskyExtendsDog husky = new HuskyExtendsDog(5);
                                    //will print all messages from DogExtendsAnimal, Animal, and Husky: all 3 instantiated
                                    // bc Husky a child class of DogExtendsAnimal and DogExtendsAnimal is child class of Animal
                                    //calls super constructor

        husky.printDetails();

        DogExtendsAnimal dog7 = new DogExtendsAnimal(3);
        dog7.setName("Rex");
        dog7.printDetails(); //won't work with instance of DogExtendsAnimal if this method is defined in HuskyExtendsDog class
                            //works now bc it's defined and is public/protected in Animal class and is inherited here in same package

        husky.eat(); //prints each call of this method starting with Animal class method

        System.out.println("avg= " + husky.getAverageWeight()); //prints 30: 10 in Animal class, adds 20 in HuskyExtendsDog class



        ///////////////USING ABSTRACT CLASSES
//        Animal2 animal2 - new Animal2();  //this won't compile, can't instantiated/create instance of an abstract class

//        Reptile2 reptile2 = new Reptile2(); //this won't work bc can't instantiate instance of abstract class
        Snake2 snake2 = new Snake2(5); //this has to have constructor that sets age as param in Snake2
        snake2.setName("Smokey");  //can call all methods on snake2, instance of Snake2 that are inherited from Animal2 and Reptile2
        snake2.printDetails();//age is 5
        snake2.setAge(22);
        //snake2.printName();  //only okay to call protected method bc this is same package. this won't compile
        snake2.printDetails();  //will now print age 22 because age has been changed from previous printDetails()
//        snake2.getWeight();
        System.out.println("Weight= " + snake2.getWeight());

        //////////////////SNAKE3 IS IN INTERFACES PACKAGE
        Snake3 snake3 = new Snake3(3);
        snake3.getTailLength();
        System.out.println("tail length= " + snake3.getTailLength()); //will print what's defined in Snake3
                                                                //if Snake3 doesn't implements, will print
                                                                //what's defined in Reptile3(parent)
        snake3.scales(5000); //this is defined in NumberScales interface, implemented in Snake3, and called here

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(5);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails(); //prints the age above and the name defined in Bear class

        //default methods for interfaces
        Rabbit2 rabbit = new Rabbit2();
        rabbit.eatPlants(); //this method isn't typed in the Rabbit2 class but it's auto implemented bc class implements this default method in Herbivore interface

        //overridden default method Walk -> Run -> CatExtendsAnimal
        CatExtendsAnimal cat = new CatExtendsAnimal(3);
        int speed = cat.getSpeed();
        System.out.println("Cat speed is " + speed);

        //static interface methods
        rabbit.printDetails(); //prints jump height in overridden method in Rabbit2
    }
}
