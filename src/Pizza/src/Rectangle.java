public class Rectangle implements IShape {
    private double _width;
    private double _height;
    public Rectangle(double w, double h) {
        _height  = h;
        _width   = w;
    }

    public double getArea() {
        return _height * _width;
    }

    public String toString() {
        return "Rectangle(h = " + _height + ", w = " + _width + ")";
    }
}

