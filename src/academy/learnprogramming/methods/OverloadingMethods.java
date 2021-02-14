package academy.learnprogramming.methods;

public class OverloadingMethods {

    public void walk(int miles) {}

    public void walk(short feet) {}

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet) {}

    public void walk (float miles) {}
//    public int walk (float miles) {} //compilation error: method with same name and same arguments
//    public static void walk (float miles) {} //also won't compile

    public void walk(int[] lengths) {}
//    public void walk(int...vars) {} //already method with same type of args: variable args treated similar to arrays, so above has same argument


    public static void main(String[] args) {
        run(1); //this calls int method
        run(1.0); //now calls double method bc float gets promoted to double
        run(9L); //now calls the double method because L gets promoted to double

        jump("test");//will only call this one
        jump(25);//there is no method that calls parameter integer

        sum(1, 2); //this calls the int method, order doesn't matter, parameter type does
                        //if int method doesn't exist goes to next biggest number: Long
                        //if both these gone, calls Integer method
                        //if all these gone, calls var args method
    }

    public static void run(int length) {}
    public static void run(Integer length){}
    public static void run(double km) {}

    public static void jump(String s) {
        System.out.println("String");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }

    public static int sum(int a, int b) {
        System.out.println("int sum");
        return a + b;
    }

    public static long sum(long a, long b) {
        System.out.println("long sum");
        return a + b;
    }

    public static Integer sum(Integer a, Integer b) {
        System.out.println("Integer sum");
        return a + b;
    }

    public static int sum(int... numbers) {
        System.out.println("sum var args");

        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
