package academy.learnprogramming.arrays;

public class ContinueStatement {

    public static void continueStatement(String[] args) {
        String[] animals1 = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        //example of break statement
        for (String animal1 : animals1) {
            if (animal1.equals("Lizard")) {
                continue;
            }
            System.out.println(animal1); //will print all animals except lizard, SKIPS TO NEXT ITERATION
        }

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
        for(String animal: animals) {
            System.out.println(animal);
        }

        MY_LOOP:
        for(String animal: animals) {
            if(animal.equals("Cat")) {
                continue MY_LOOP;
            }
            System.out.println(animal);//will print all except for cat, skips that iteration of the loop and doesn't execute this statment for that iteration
        }

        ///confusing:
        animal:
        for(String animal: animals){    //a confusing label ---- LABELS ARE OPTIONAL, but best if not same as variable name
            if(animal.equals("Cat") || animal.equals("Lizard")) {
                continue animal;
            }
            System.out.println((animal));
        }

        int index = 0;
        while(index < animals.length) {   //this creates an endless loop, index always less than length and index increments in code that gets skipped after continue stmt
            String animal = animals[index];
            if(animal.equals("Lizard")) {
                continue;
            }
            System.out.println(animal);
            index++;                //this gets skipped when continue runs, so doesn't increment and index always < length
        }

        //good version of above ^
        int index1 = 0;
        while(index1 < animals.length) {   //now the index will increase before the continue stmt skips the print stmt, will end when index not < animals.length
            String animal = animals[index1];  //index will apply to animals, will only go to length
            index1++;                           //this won't increment after length is reached, preventing outofbounds exception
            if(animal.equals("Lizard")) {
                continue;
            }
            System.out.println(animal);
        }
    }
}
