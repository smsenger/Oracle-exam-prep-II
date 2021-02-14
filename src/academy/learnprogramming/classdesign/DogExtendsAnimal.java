package academy.learnprogramming.classdesign;

import academy.learnprogramming.classdesign.Animal;
import academy.learnprogramming.classdesign.interfaces.CanRun;
import academy.learnprogramming.classdesign.interfaces.HasTail;

public class DogExtendsAnimal extends Animal implements HasTail, CanRun { //by extension a child of Object

    public DogExtendsAnimal(int age) {
        super(age);    //calls constructor in Animal w/age/int param
                        //this calls Animal constructor, gets called automatically if parent class has no argument constructor
        System.out.println("Dog");
                        //can call name field from Animal bc it's protected
                        //can't call age field from Animal bc it's private
    }

    @Override
    public void eat() {
        super.eat(); //calls method in Animal/parent class/super class
                    //don't have to call parent class, can define completely different logic without inheriting parent method logic
        System.out.println("Dog eating.");

        //super.eat() //okay to call this after other statements
                        //will print husky, then Animal, then dog
    }

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
//        return getAverageWeight() + 20;  //warning: recursive call, this method will continue to call itself forever: 1st call on 25, 2nd on 27
        //return 20.0;
    }

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int run(int speed) {
        return 0;
    }
}
