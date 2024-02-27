package abcd.example.math.geometry;

import java.util.Arrays;

public class Triangle {
    private double a, b, c;
    private double area;
    private double perimeter;
    private static final double DELTA = 0.00001;

    public Triangle(double a, double b, double c)
    {

        if(!isTriangle(a, b, c))
            throw new IllegalArgumentException("A triangle can not be formed with provided value");

        this.a = a;
        this.b = b;
        this.c = c;
        setAreaAndPerimeter();

    }

    public double getA()
    {
        return this.a;
    }

    public void setA(double a)
    {
        if(!isTriangle(a, this.b, this.c)) {
            System.out.println("A triangle can not be formed with provided value. Sides remain unchanged");
            return;
        }
        this.a = a;
        setAreaAndPerimeter();
    }

    public double getB()
    {
        return this.b;
    }

    public void setB(double b)
    {
        if(!isTriangle(this.a, b, this.c)) {
            System.out.println("A triangle can not be formed with provided value. Sides remain unchanged");
            return;
        }
        this.b = b;
        setAreaAndPerimeter();
    }

    public double getC()
    {
        return this.c;
    }

    public void setC(double c)
    {
        if(!isTriangle(this.a, this.b, c)) {
            System.out.println("A triangle can not be formed with provided value. Sides remain unchanged");
            return;
        }
        this.c = c;
        setAreaAndPerimeter();
    }

    public double getArea()
    {
        return area;
    }

    private void setAreaAndPerimeter()
    {
        this.perimeter = this.a + this.b + this.c;
        double s = this.perimeter / 2;
        this.area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    private boolean isTriangle(double a, double b, double c)
    {
        return a + b > c && a + c > b && b + c > a;
    }

    public boolean equals(Object other)
    {
        if(!(other instanceof Triangle t))
            return false;

        double[] thisSides = {this.a, this.b, this.c};
        double[] otherSides = {t.a, t.b, t.c};

        Arrays.sort(thisSides);
        Arrays.sort(otherSides);

        return Math.abs(thisSides[0] - otherSides[0]) < DELTA
                && Math.abs(thisSides[1] - otherSides[1]) < DELTA
                && Math.abs(thisSides[2] - otherSides[2]) < DELTA;
    }

    public String toString()
    {
        return String.format("Triangle sides: (%f, %f, %f)", this.a, this.b, this.c);
    }

}
