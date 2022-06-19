package AllExercise;

public class Rectangle extends Shape{


    double width;
    double length;

    public Rectangle(double width, double length,String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLenght(double lenght) {
        this.length = lenght;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
