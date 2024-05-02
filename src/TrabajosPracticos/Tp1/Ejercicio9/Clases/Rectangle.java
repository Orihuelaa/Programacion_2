package TrabajosPracticos.Tp1.Ejercicio9.Clases;

public class Rectangle extends GeometricFigure {


    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double calculatePerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }
    @Override
    public double calculateArea() {
        return (this.length * this.width);
    }
}
