package AllExercise;

public class Square extends Rectangle{

    private double side;
    
    public Square(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side;
    }
    
    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
