package academy.learnprogramming.classdesign.abstractclasses;

import academy.learnprogramming.classdesign.abstractclasses.Animal2;

public class Rabbit2 extends Animal2 {

    public Rabbit2() {
//        super; //will not compile bc not a statement, expecting super.
//        super().setAge(3); //does not compile bc it's a call
        super();        //this will compile
//        super.setAge(3); //this compiles because it's using super.

//        this.setAge(3);  //these two will call the same method in Animal class
        setAge(3);      //not necessary to use this. or super. or super();
    }

    public Rabbit2(int age) {
//        this(age); //recursive constructor invocation: the method and this() will call each other foreeever

//        super(); //calls empty constructor in Animal class
//        this();  //calls constructor above, can't have super() and this()
//        setAge(3); //like the code above
        super(3);  //works bc there is a parent constructor in Animla with (int age) parameter
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void printName() {
        System.out.println("Name= " +getName());
    }
}
