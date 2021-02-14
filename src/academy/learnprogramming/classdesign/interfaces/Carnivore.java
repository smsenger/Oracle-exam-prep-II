package academy.learnprogramming.classdesign.interfaces;

public interface Carnivore {

//    void eatMeat();

    default void eatMeat() {
        System.out.println("Eating meat.");
    }
}
