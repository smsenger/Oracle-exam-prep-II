package academy.learnprogramming.methods;

public class Static {

    private String name = "Static"; //instance field, not a static field

    public static void one() {};

    public static void two() {}

    public static void three() {
        one();
        two();
        //three();//this is recursion, so don't do it
        //four(); //compile time error, non-static can't be called by static method
//        System.out.println(name); //non-static field, won't work
    }

    public void four() {
        one();
        two();
        three();
        System.out.println(name); //can call this bc four isn't a static method
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();

//        four(); //not static
        Static myInstance = new Static();
        myInstance.four(); //this is how you call four: create instance of class
        new Static().four(); //this also works
    }
}
