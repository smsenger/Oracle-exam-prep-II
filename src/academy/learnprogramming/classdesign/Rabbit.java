package academy.learnprogramming.classdesign;

import academy.learnprogramming.classdesign.Animal;

public class Rabbit extends Animal {  //Animal class had to have default constructor defined for this to work bc compiler adds default constructor
                                    //default constructor adds super constructor inside the Animal class
    public Rabbit() {
//        super; //will not compile bc not a statement, expecting super.
//        super().setAge(3); //does not compile bc it's a call
        super();        //this will compile
//        super.setAge(3); //this compiles because it's using super.

//        this.setAge(3);  //these two will call the same method in Animal class
        setAge(3);      //not necessary to use this. or super. or super();
    }

    public Rabbit(int age) {
//        this(age); //recursive constructor invocation: the method and this() will call each other foreeever

//        super(); //calls empty constructor in Animal class
//        this();  //calls constructor above, can't have super() and this()
//        setAge(3); //like the code above
        super(3);  //works bc there is a parent constructor in Animla with (int age) parameter

    }

}
