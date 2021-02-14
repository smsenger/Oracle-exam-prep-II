package academy.learnprogramming.classdesign;

import academy.learnprogramming.classdesign.interfaces.Run;
import academy.learnprogramming.classdesign.interfaces.Walk;

public class CatExtendsAnimal extends Animal implements Walk /*Run*/ {  //by extension a child of Object
    public CatExtendsAnimal(int age) {
        super(age);  //must add argument and call super here bc Animal doesn't have "no argument constructor" to call
    }

    @Override
    public int getSpeed() {  //this overrides this method in Run, which overrides the one in walk
        return 50;
    }
}
