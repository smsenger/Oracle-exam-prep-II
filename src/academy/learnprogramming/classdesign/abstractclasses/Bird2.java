package academy.learnprogramming.classdesign.abstractclasses;

import academy.learnprogramming.classdesign.abstractclasses.Animal2;

public class Bird2 extends Animal2 {

    public class Bird2b {

        public void fly() {
            System.out.println("Bird is flying.");
        }

        public void eat(int amount) {  //this isn't using the same method as abstract class Animal2 bc it's overloaded
            System.out.println("Bird is eating " + amount + " units of food.");
        }
    }

    public int getWeight() {
        return 1;
    }

    @Override
    protected void printName() {
        System.out.println("My name is " + getName());
    }
}
