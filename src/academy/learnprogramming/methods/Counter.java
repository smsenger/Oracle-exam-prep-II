package academy.learnprogramming.methods;

public class Counter {

    public static int count; //constructor
    public int anotherCount;//constructor

    public Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter(); //this calls the Counter method, pt of constructor
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        System.out.println(count);//all of these are 4 bc static fields shared between all instances, if count changes, it changes for all instances
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        count++;

        System.out.println(count);//all of these are 5 bc static fields shared between all instances, if count changes, it changes for all instances
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

//        System.out.println(anotherCount);//can't call this because it's non-static
        System.out.println(one.anotherCount);//these are all 1 because state of instance field applies only to individual instances
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);


        one.anotherCount = 2;
        two.anotherCount = 3;
        three.anotherCount = 4;
        four.anotherCount = 5;

        System.out.println(one.anotherCount);//2, instance variables not shared betwen other classes
        System.out.println(two.anotherCount);//3
        System.out.println(three.anotherCount);//4
        System.out.println(four.anotherCount);//5




    }
}
