package academy.learnprogramming.methods;

public class MethodReturnType {

    public void jump () {} //returns nothing
    public void jump2() {
        return;         //this is unnecessary/redundant
    }

    public String jump3() {
        return "";
    }

    //public String jump4() {}//compilation error, no return statement

    //public jump5() {}//does not compile, no return type

//    String jump6(int a) {
//        if (a == 5) {
//            return ";";  //if the if is false, this method returns nothing and expecting a string
//        }
//    }

    int getInt() {  //compiles, assignable to return type
        return 9;
    }

//    int getLong() {  //does not compile, 9 is not auto converted to int
//        return 9L;  //can cast into int, then it compiles
//    }

    int expanded() {
//        int temp = 10;
//        return temp;
        return 10;
    }

    boolean isTrue() {
//        return 5 < 10;
        return 5 ==5;//both of these work, can use expressions in return statement
    }

//    public void 2test() {} won't compile

    public void $test() {} //compiles
    public void _test() {}//compiles
}
