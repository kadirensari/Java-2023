package abcd.example.math.geometry;

public final class MutablePoint {
    private double x;
    private double y;

    MutablePoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    private MutablePoint(double a, double b, boolean polar)
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

    public static MutablePoint createCartesian(double x, double y)
    {
        return new MutablePoint(x, y, false);
    }

    public static MutablePoint createPolar(double radius, double theta)
    {
        return new MutablePoint(radius, theta, true);
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(MutablePoint other)
    {
        return distance(other.x, other.y);
    }

    public double distance(double x, double y)
    {
        return PointCommon.distance(this.x, this.y, x, y);
    }

    public void offset(double dx, double dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public Point toPoint()
    {
        return new Point(this.x, this.y);
    }

    public boolean equals(Object other)
    {
        return other instanceof MutablePoint p && PointCommon.equals(this.x, this.y, p.x, p.y);
    }

    public String toString()
    {
        return PointCommon.toString(this.x, this.y);
    }

}
