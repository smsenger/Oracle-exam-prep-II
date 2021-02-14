package academy.learnprogramming.arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BreakStmtAndLabels {

    public static void breakStmtAndLabels(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        //example of break statement
        for (String animal : animals) {
            if (animal.equals("Lizard")) {
                break;
            }
            System.out.println(animal); //will print animals before "Lizard"
        }

            //a label: optional pointer to head of loop, tells app to jump from label or break from loop
            //one word, can be added to several types of statements

//            myLabel:
//            int[] myArray = {1, 2, 3}; //won't compile;CAN'T ADD LABEL TO VARIABLE DECLARATION

            myLabel: {
                int[] myArray = {1, 2, 3}; //valid here bc in a {}, this only available inside this block
            }

            String[] animals2 = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
            for(String animal2: animals2) {
                System.out.println(animal2);
            }

            MY_LOOP: for (String animal2: animals2) {
                if(animal2.equals("Cat")) {
                    break MY_LOOP;
                }
                System.out.println(animal2); //only prints "Dog"
            }

            animal2: for(String animal2: animals2) { //confusing bc animal2 is used as label
                if(animal2.equals("Cat")) {
                    break animal2;
                }
        }

            int index = 0;
            while(index < animals2.length) {
                String animal2 = animals2[index];

                if(animal2.equals("Lizard")) {
                    break;
                }
                System.out.println(animal2);  //same result as a for loop for this content, just longer
                index++;
            }

    }
}
