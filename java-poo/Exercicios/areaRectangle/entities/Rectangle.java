package entities;

public class Rectangle {
    public double width;
    public double heigth;

    public double area() {
        return heigth * width;
    }

    public double perimeter() {
        return 2*(heigth+width);
    }

    public double Diagonal() {
        return Math.sqrt((width * width)+(heigth * heigth));
    }
}
