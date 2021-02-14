package academy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {

    public static void arrayListMethods1(String[] args) {
        //if don't specify type of object, Object used
        //can hold int, string, floats, etc. AT THE SAME TIME

        List list = new ArrayList();//same as List<Object> list = new ArrayList<>();
        list.add("dog");
        list.add(5);
        System.out.println(list);//elements w/, between inside []
        System.out.println(list.toString());//don't have to do this, println will call toString automatically

        //PETS.ADD(ELEMENT), PETS.ADD(INDEX, ELEMENT)
        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);//prints dog
        pets.add(0, "cat");
        System.out.println(pets);//prints cat, dog

        //pets.add(5);//wrong type compilation time error
        //cat(0), dog(1)
        pets.add(1, "parrot"); //cat, parrot, dog
        pets.add(0, "husky"); //husky, cat parrot dog -- husky @ 0, everything else moved down
        pets.add(1, "bird"); //husky, bird, cat, parrot, dog
        System.out.println(pets);

        //PETS.REMOVE(Object) || PETS.REMOVE(index)
        pets.remove("parrot");
        System.out.println(pets);//husky, bird, cat, dog -- dog moves up the list to where parrot was

        pets.remove(2);//husky, bird, dog --dog moves to cat's former place

        //SET -- changes an element w/0 changing size of list, provide index of item to change
        pets.set(0, "newBird");//newBird, bird, dog

                //pets[0] = "newBird" --> w/Array[] pets
        //pets.set(6, "kitty"); won't compile, IndexOutOfBoundsException, range is size -1, same error as w/Array

    }
}
