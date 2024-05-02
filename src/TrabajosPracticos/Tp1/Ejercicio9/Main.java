package TrabajosPracticos.Tp1.Ejercicio9;

import TrabajosPracticos.Tp1.Ejercicio9.Clases.Circle;
import TrabajosPracticos.Tp1.Ejercicio9.Clases.Rectangle;

/*
9-Se desea implementar un programa en Java para modelar diferentes figuras geométricas, como
círculos y rectángulos. Cada figura geométrica debe tener la capacidad de calcular su área y su
perímetro.
Define una clase base llamada FiguraGeometrica que contenga métodos abstractos para calcular el
área y el perímetro de la figura. Luego, crea subclases para representar diferentes tipos de figuras
geométricas, como Circulo y Rectángulo, que hereden de la clase base FiguraGeometrica.
En la subclase Círculo, implementa métodos para calcular el área y el perímetro de un círculo,
utilizando el radio como atributo de la clase. En la subclase Rectángulo, implementa métodos para
calcular el área y el perímetro de un rectángulo, utilizando la longitud y la anchura como atributos
de la clase.
En el programa principal, crea instancias de diferentes figuras geométricas (al menos un círculo y un
rectángulo) y muestra sus áreas y perímetros.
*/
public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);


        double perimeterCircle1 = circle1.calculatePerimeter();
        double areaCircle1 = circle1.calculateArea();
        double perimeterCircle2 = circle2.calculatePerimeter();
        double areaCircle2 = circle2.calculateArea();


        System.out.println("Circle 1:");
        System.out.println("Perimeter: " + perimeterCircle1);
        System.out.println("Area: " + areaCircle1);
        System.out.println("Circle 2:");
        System.out.println("Perimeter: " + perimeterCircle2);
        System.out.println("Area: " + areaCircle2);


        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(5, 6);


        double perimeterRectangle1 = rectangle1.calculatePerimeter();
        double areaRectangle1 = rectangle1.calculateArea();
        double perimeterRectangle2 = rectangle2.calculatePerimeter();
        double areaRectangle2 = rectangle2.calculateArea();


        System.out.println("Rectangle 1:");
        System.out.println("Perimeter: " + perimeterRectangle1);
        System.out.println("Area: " + areaRectangle1);
        System.out.println("Rectangle 2:");
        System.out.println("Perimeter: " + perimeterRectangle2);
        System.out.println("Area: " + areaRectangle2);
    }
}

