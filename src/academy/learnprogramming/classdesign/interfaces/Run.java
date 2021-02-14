package academy.learnprogramming.classdesign.interfaces;

public interface Run extends Walk {

    default int getSpeed() {   //bc this extends Walk interface, this method overrides this method in Walk
        return 10;
    }
}
