package academy.learnprogramming.classdesign;

public class Eagle extends Bird {

    public int fly(int height) {        //overloading the fly method from Bird/parent class
        System.out.println("Eagle is flying " + height + " meters.");
        return height;
    }

    @Override //this is optional
    public void eat(int amount) { //this overrides the eat method in Bird class: has same return type, same name, and same params

    }
}
