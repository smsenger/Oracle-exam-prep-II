package academy.learnprogramming.classdesign.interfaces;

public interface Walk {

    default int getSpeed() {
        return 5;
    }
}
