package academy.learnprogramming.classdesign;

public class DefaultConstructor {   //this also has default constructor at compile time

    public static void defaultConstructor() {
        Dog2 dog2 = new Dog2(); //this relies on a DEFAULT CONSTRUCTOR, bc Dog2 class doesn't have an explicit constructor
                                //DEFAULT CONSTRUCTOR created when code is compiled
                                //if uncomment constructor in Dog2 class, this won't work bc there is a private constructor that you can't use here,
                                //public default constructor can't be used

    }
}
