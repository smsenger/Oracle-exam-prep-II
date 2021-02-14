package academy.learnprogramming.classdesign.abstractclasses;

import academy.learnprogramming.classdesign.abstractclasses.Animal2;

public abstract class Reptile2 extends Animal2 {

    public Reptile2(int age) {
        super(age);    //calls constructor in Animal w/age/int param
        //this calls Animal constructor, gets called automatically if parent class has no argument constructor
        System.out.println("Dog");
        //can call name field from Animal bc it's protected
        //can't call age field from Animal bc it's private
    }

    protected boolean hasLegs() {
        return true;
    }

    public double getAverageWeight() { //this overrides this method from Animal2
        return super.getAverageWeight() + 20;
//        return getAverageWeight() + 20;  //warning: recursive call, this method will continue to call itself forever: 1st call on 25, 2nd on 27
        //return 20.0;
    }

    public int getWeight() {
        return 2;
    }
}
