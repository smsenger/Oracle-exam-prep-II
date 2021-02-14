package academy.learnprogramming.classdesign.interfaces;

import academy.learnprogramming.classdesign.abstractclasses.Reptile2;

public class Snake3 extends Reptile3 {

    public Snake3(int age) {
        super(age);
        System.out.println("Husky");
    }

//    @Override
//    public void printName() {   //this comes from Reptile3 abstract class
//        System.out.println("Snake3 is named " + getName()); //getName() is a non-abstract methods from Animal2
//    };

    @Override
    public int getTailLength() {
        return 30;
    }

    @Override
    public void scales(int scales) {
        System.out.println("Scales on body= " + scales);   //this class has to implement this interface method bc its parent class, Reptile3, does not do so
    }

    @Override
    protected void printName() {
        System.out.println("Snake2 is name " + getName());
    }

    @Override
    public int getWeight() {   //this comes from Animal2 abstract class, which Reptile2 extends
        return 0;
    }

}
