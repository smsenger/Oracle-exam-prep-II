package academy.learnprogramming.arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {

    public static void usingWrappersInList(String[] args) {
        //List<double> doubleList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); //autoboxing, add converts double primitive into double class
        doubleList.add(new Double(55.10)); //warning:unnecessary boxing
        doubleList.remove(55.10);//autoboxing converts this to Double
        double first = doubleList.get(0);//unboxing to primitive, get() will return a double
        System.out.println(doubleList); //[10.5] --> array w/object
        System.out.println(first); //10.5 --> primitive element

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        System.out.println(numbers);//[null]

        //int number = numbers.get(0); //[null] array will get NullPointerException
                                    //primitives can't hold null, can only hold numbers
                                    //wrappers can hold and be null

        //remove(integer) and remove(object)
        List<Integer> nums = new ArrayList<>();
        nums.add(1);//autoboxing, changes int to obj
        nums.add(2);
        nums.remove(1);//removes element at index 1
        System.out.println(nums);//prints 1, removes Integer at index 1

        nums.remove(new Integer(1)); //this removes the element 1
    }
}
