package abcd.example.math;

public class Complex {
    private static final double DELTA = 0.000001;
    private double real;
    private double imag;


    public Complex(){}

    public Complex(double real)
    {
        this.real = real;
    }

    public Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public double getReal()
    {
        return real;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public double getImag()
    {
        return imag;
    }

    public void setImag(double imag)
    {
        this.imag = imag;
    }

    public static Complex add(double a1, double b1, double a2, double b2)
    {
        return new Complex(a1 + a2, b1 + b2);
    }

    public static Complex add(double real, Complex z)
    {
        return add(real, 0, z.real, z.imag);
    }
//
//    public static Complex subtract(double a1, double b1, double a2, double b2)
//    {
//        return add(a1, b1, -a2, -b2);
//    }
//
//    public static Complex subtract(double real, Complex z)
//    {
//        return subtract(real, 0, z.real, z.imag);
//    }
//
//    public static Complex multiply(double a1, double b1, double a2, double b2)
//    {
//        return new Complex(a1 * a2 - b1 * b2, a1 * b2 + a2 * b1);
//    }
//
//    public static Complex multiply(double real, Complex z)
//    {
//        return multiply(real, 0, z.real, z.imag);
//    }
//
//    public double getLength()
//    {
//        return Math.sqrt(real * real + imag * imag);
//    }

    public Complex getConjugate()
    {
        return new Complex(real, -imag);
    }

    public Complex add(double real)
    {
        return add(this.real, this.imag, real, 0);
    }

    public Complex add(Complex other)
    {
        return add(this.real, this.imag, other.real, other.imag);
    }
//
//    public Complex subtract(double real)
//    {
//        return subtract(this.real, this.imag, real, 0);
//    }
//
//    public Complex subtract(Complex other)
//    {
//        return subtract(this.real, this.imag, other.real, other.imag);
//    }
//
//    public Complex multiply(double real)
//    {
//        return multiply(this.real, this.imag, real, 0);
//    }
//
//    public Complex multiply(Complex other)
//    {
//        return multiply(this.real, this.imag, other.real, other.imag);
//    }
//
//    public void inc()
//    {
//        inc(1);
//    }
//
//    public void inc(double real)
//    {
//        this.real += real;
//    }
//
//    public void dec()
//    {
//        dec(1);
//    }
//
//    public void dec(double real)
//    {
//        inc(-real);
//    }

    public boolean equals(Object other)
    {
        return other instanceof Complex z && Math.abs(this.real - z.real) < DELTA && Math.abs(this.imag - z.imag) < DELTA;
    }

    public String toString()
    {
        return String.format("(%f, %f)", this.real, this.imag);
    }

}
