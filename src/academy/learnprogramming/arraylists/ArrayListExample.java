package academy.learnprogramming.arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void arrayListExample(String[] args) {
        ArrayList myList = new ArrayList(); //type of obj not specified, can hold any type of object
        ArrayList<Object> myList2 = new ArrayList<Object>(); //object is specified, every class in Java a type of object
                                                            //can add String, double, int array, etc. to this
        ArrayList<String> list = new ArrayList<String>();//can only store strings
        ArrayList<String> list2 = new ArrayList<>();//SINCE JAVA 5 DON'T NEED ANYTHING INSIDE RIGHT <>, diamond operator
        List<String> list3 = new ArrayList<>();//using interface as type, polymorphism
                                                //can put any type in <>


        //ArrayList<String> list4 = new List<>();//doesn't compile, does class first, then interface on right
        List<String> list5 = new ArrayList<>(20);//CAN declare interface then class
                                                            //DYNAMIC: auto resize when adding more elements (unlike Array)

    }
}
