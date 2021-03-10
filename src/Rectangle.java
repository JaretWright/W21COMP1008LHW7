public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter()
    {
        return 2*width+2*length;
    }

    public double getArea()
    {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length>0 && length <100)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be >0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }
}
