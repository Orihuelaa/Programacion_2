package TrabajosPracticos.Tp1.Ejercicio9.Clases;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return (this.radius * 2 * Math.PI);
    }
    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(this.radius,2));
    }
}
