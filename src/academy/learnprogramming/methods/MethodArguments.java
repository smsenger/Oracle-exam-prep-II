package academy.learnprogramming.methods;

public class MethodArguments {

    int getZero() { //zero arguments/parameters: niladic
        return 0;
    }

    int increment(int number) { //1 argument: monodic
        return number++;
    }

    int sum(int a, int b) {//2 arguments: dyadic
        return a + b;
    }

    int plusMinus(int a, int b, int c) {//3 arguments: triadic
        return a + b - c;
    }

    double average(double a, double b, double c, double d) {//4 arguments: plyadic
        return a + b + c + d/4.0;
    }

//    void test{} will not compile, no () for arguments
//    void test(int a; int b){} will not compile, uses ; instead of ,

    void test(int a, int b) {}//compiles, void method can have empty body

//    void test2(int a);//missing method body, will not compile


}
