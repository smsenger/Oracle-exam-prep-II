package academy.learnprogramming.classdesign.interfaces;

public interface Herbivore {

//    void eatPlants();

    default void eatPlants() {     //no need to specify public, is automatically public
        System.out.println("Eating plants.");
    }

//    default int getRequiredPlantAmount(); //will not compile, must have a body

//    public int getRequiredPlantAmount() {  //won't compile bc doesn't have default keyword
//        return;
//    }
}
