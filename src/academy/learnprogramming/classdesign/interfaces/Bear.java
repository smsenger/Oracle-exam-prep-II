package academy.learnprogramming.classdesign.interfaces;

public class Bear extends Animal3 implements Omnivore{  //Omnivore interfact merges Herbivore and Carnivore into one


    @Override
    public void eatPlants() {   //this overrides the default eatPlants method in Herbivore
                                //if this commented out will still compile, executes this method in Herbivore interface
        System.out.println("Bear eating plants.");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat.");
    }

    @Override
    protected void printName() {
        System.out.println("Bear");
    }

    @Override
    public int getWeight() {
        return 2000;
    }
}
