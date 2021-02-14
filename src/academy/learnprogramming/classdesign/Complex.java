package academy.learnprogramming.classdesign;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex plus(Complex b) {   //to add two complex numbers, need to create a new complex number and add it to first number
                                        //doesn't change current number, doesn't change b number, creates a new complex number
                                        //can also -, *
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus(Complex b) {
        double newReal = real - b.real;
        double newImaginary = imaginary - b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b) {
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImaginary = real * b.imaginary + imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

    public static Complex plus(Complex a, Complex b) {   //in static methods can't use private vars or instance vars
//        double real = a.real + b.real;
//        double imaginary = a.imaginary + b.imaginary;
//        return new Complex(real, imaginary);
        return a.plus(b); //same as above lines
    }

    public static void mainComplex() {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        Complex bPlusA = b.plus(a);
//        Complex bPlusA = Complex.plus(a, b);  //this will get same results as above

        System.out.println("a real= " + a.real + "a imaginary= " + a.imaginary);  //these will stay the same bc not changing original vars when calling plus method
        System.out.println("b real= " + b.real + "b imaginary= " + b.imaginary);  //same value for b
        System.out.println("b + a real= " + bPlusA.real + " imaginary= " + bPlusA.imaginary); //vals change bc creating a new instance of complex number
                                                                                                //same for minus and times methods
    }
}
