package academy.learnprogramming.arrays;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void workingWithArrays(String[] args) {
        int[] one = new int[3]; //array w/3 elements, it's empty but all elements are 0
        int[] two = new int[]{10, 11, 12};//array with 3 elements but initialized/not empty

        //double[] a = new double[2.55] //this won't work bc array won't take decimals
        double[] b = new double[4 * 5 / 2];//array w/10 elements, all 0

        int x = 4;
        int y = 4;
        double[] c = new double[x*y];//empty array w/16 elements
        int[] three = {10, 11, 12};//anonymous array, no type on the right

        int[] four = {};//size is 0

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] ids, types; //creates 2 arrays
        int ids2[], types2; //creates an array and an int

        //storing object in array
        String[] animals = {"parrot", "dog", "cat"}; //anonymous array w/3 elements
        String[] myAnimals = animals; //reference to same obj as above
        String[] otherAnimals = {"parrot", "dog", "cat"}; //new obj
        //check equality
        System.out.println(animals.equals(myAnimals));
        System.out.println(animals == myAnimals); //for obj arrays this is the same as above -- equals() is arrayObject == anotherArrayObject//here it's equal bc ref to same obj array
        System.out.println(Arrays.equals(animals, myAnimals)); //check if elements inside array are equal, these are same ref so true

        System.out.println(animals.equals(otherAnimals)); //false bc not the same reference, even though same elements
        System.out.println(animals == otherAnimals);//false
        System.out.println(Arrays.equals(animals, otherAnimals)); //will be equals bc content is the same even though different reference

        //to print array
        System.out.println(animals); //[Ljava.lang.String;memoryAddress
        System.out.println(animals.toString());//same as above
        System.out.println(Arrays.toString(animals));//will print content, including square brackets



    }
}
