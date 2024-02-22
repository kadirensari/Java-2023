package abcd.example.math.geometry;

public final class Point {
    private final double x;
    private final double y;

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    private Point(double a, double b, boolean polar)
    {
        if(polar) {
            x = a * Math.cos(b);
            y = a * Math.sin(b);
        }
        else {
            x = a;
            y = b;
        }
    }

    public static Point createCartesian(double x, double y)
    {
        return new Point(x, y, false);
    }

    public static Point createPolar(double radius, double theta)
    {
        return new Point(radius, theta, true);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(double x, double y)
    {
        return PointCommon.distance(this.x, this.y, x, y);
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(Point other)
    {
        return distance(other.x, other.y);
    }

    public MutablePoint toMutablePoint()
    {
        return new MutablePoint(this.x, this.y);
    }

    public boolean equals(Object other)
    {
        return other instanceof Point p && PointCommon.equals(this.x, this.y, p.x, p.y);
    }

    public String toString()
    {
        return PointCommon.toString(this.x, this.y);
    }

}
