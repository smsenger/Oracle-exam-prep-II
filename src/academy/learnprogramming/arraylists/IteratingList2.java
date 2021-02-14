package academy.learnprogramming.arraylists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {

    public static void iteratingList() {
        List<String> list = Arrays.asList(createArray());

        //measure time of execution for for loops
        long startTime = System.currentTimeMillis(); //returns long so var needs to be long

        //for loop
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;//provides execution time for for loop
        System.out.println("for loop total time = " + totalTime + " ms.");


        //for each loop
        startTime = System.currentTimeMillis();
        for (String temp : list) {}

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each loop total time = " + totalTime + " ms.");

        //for each compiled to below:
//        String str;
//        for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); str = iterator.next());


        //Iterator
        startTime = System.currentTimeMillis();
        for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterator total time = " + totalTime + " ms.");


        //listIterator
        startTime = System.currentTimeMillis();

        for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator total time = " + totalTime + " ms.");
    }


    private static String[] createArray() {
        String[] stringArray = new String[10_000_000];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }

}
