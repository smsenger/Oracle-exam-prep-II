package academy.learnprogramming.arraylists;

import java.util.*;

public class IteratingList1 {

    public static void iteratingList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        //ConcurrentModificationException: for and for each loops
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index" + i + " is " + numbers.get(i));
            //numbers.remove(2); //index out of bound exception, loop is trying to print index 2 element but it has been removed
            //numbers.remove(i);//similar problem
        }

        for (Integer number : numbers) {
            System.out.println("number= " + number);
            //numbers.remove(2);//concurrent modification exception, can't modify list you're iterating through
        }

        //Iterator
        //Iterator methods: hasNext(), next(), remove()
        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {    //specify same type as List
            Integer number = iterator.next(); //iterator has cursor that points between 2 elements, so it's always looking at next element
                                              //doesn't need to remember current item, just next item
            System.out.println(number);

            iterator.remove();//will remove current item when calling next, here removes one by one. will return each element on separate line
                                //then below prints [] because all elements have been removed
        };
        System.out.println(numbers); //


        // List Iterator
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous());//prints backwards, starting from index 3: 3, 2, 1
            listIterator.remove();//removes
        }
        System.out.println(numbers);//remaining numbers after removal after index 3 are [4, 5, 6]
    }
}
