package academy.learnprogramming.classdesign.main;

import academy.learnprogramming.classdesign.Animal;
import academy.learnprogramming.classdesign.CatExtendsAnimal;
import academy.learnprogramming.classdesign.HuskyExtendsDog;
import academy.learnprogramming.classdesign.Rabbit;
import academy.learnprogramming.classdesign.interfaces.Rabbit2;

public class PolyParameters {

    public static void main(String[] args) {

        HuskyExtendsDog husky = new HuskyExtendsDog(3);
        husky.setName("Rex");
        printDetails(husky);   //can now call this method with husky as param bc it's a child of a class that extends Animal

        Rabbit2 rabbit = new Rabbit2();
        rabbit.setName("Bunny");

        CatExtendsAnimal cat = new CatExtendsAnimal(2);
        cat.setName("Tom");

        Animal rex = createAnimal("Rex", 4);
        printDetails(rex);

        Animal kitty = createAnimal("Kitty", 3);
        printDetails(kitty);

        Animal bunny = createAnimal("Bunny", 2);
        printDetails(bunny);
    }
/*

    public static void printDetails(HuskyExtendsDog husky) {
        husky.printDetails();
    }

    public static void printDetails(Rabbit2 rabbit) {
        rabbit.printDetails();
    }
*/


    //POLYMORPHIC PARAMETERS
    public static void printDetails(Animal animal) {    //this param is polymorphic bc any instance of Animal can put itself here (husky, etc)
        animal.printDetails();
    }


    //USES POLYMORPHISM
    public static Animal createAnimal(String name, int age) {
        if(name.equals("Rex")) {
            Animal animal = new HuskyExtendsDog(age);
            animal.setName(name);
            return animal;  //this animal in memory is an instance of HuskyExtendsDog, and this is an instance of animal bc polymorphism ----> POLYMORPHIC PARAMETERS
        } else if (name.equals("Kitty")) {
            CatExtendsAnimal cat = new CatExtendsAnimal(age);
            cat.setName(name);
            return cat;  //an instance of CatExtendsAnimal, but if Animal was used instead would be instance of Animal bc polymorphism
        }
        Animal rabbit = new Rabbit(age);  //this uses polymorphism bc creates instance of Animal using Rabbit
        rabbit.setName(name);
        return rabbit;
    }
}
