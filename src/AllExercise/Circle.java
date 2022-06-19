package AllExercise;

public class Circle extends Shape {

    double radius;

    public Circle(double radios,String color, boolean filled) {
        super(color, filled);
        this.radius = radios;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadios(double radios) {
        this.radius = radios;
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*(radius*2);
    }
}
