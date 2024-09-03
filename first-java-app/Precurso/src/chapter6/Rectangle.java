package chapter6;

import java.util.Scanner;

public class Rectangle {

    private double length;
    private double width;

    // Constructor por defecto
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Constructor con parámetros
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Método getter para length
    public double getLength() {
        return length;
    }

    // Método setter para length
    public void setLength(double length) {
        this.length = length;
    }

    // Método getter para width
    public double getWidth() {
        return width;
    }

    // Método setter para width
    public void setWidth(double width) {
        this.width = width;
    }

    // Método para calcular el área
    public double calculateArea() {
        return length * width;
    }

    // Método para calcular el perímetro
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
