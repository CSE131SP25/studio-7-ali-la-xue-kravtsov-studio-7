package studio7;

public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + "i";
        } else {
            return real + " + " + imaginary + "i";
        }
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 3); // 2 + 3i
        Complex complex2 = new Complex(4, -1); // 4 - i

        Complex sum = complex1.add(complex2);
        System.out.println("Sum: " + sum); // 6 + 2i

        Complex product = complex1.multiply(complex2);
        System.out.println("Product: " + product);  // 11 + 10i
    }
}