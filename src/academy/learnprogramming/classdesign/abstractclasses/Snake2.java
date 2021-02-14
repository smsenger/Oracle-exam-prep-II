package academy.learnprogramming.classdesign.abstractclasses;

import academy.learnprogramming.classdesign.abstractclasses.Reptile2;

public class Snake2 extends Reptile2 {

    public Snake2(int age) {
        super(age);
        System.out.println("Husky");
    }

//    @Override
//    public void printName() {   //this comes from Reptile2 abstract class
//        System.out.println("Snake2 is named " + getName()); //getName() is a non-abstract methods from Animal2
//    };

    @Override
    protected void printName() {
        System.out.println("Snake2 is name " + getName());
    }

    @Override
    public int getWeight() {   //this comes from Animal2 abstract class, which Reptile2 extends
        return 0;
    }

}
