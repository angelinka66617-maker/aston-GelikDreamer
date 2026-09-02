package lesson_4;

public class Rectangle implements Shape {
    private double width;
    private double length;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double length, String borderColor, String fillColor) {
        this.width = width;
        this.length = length;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2*(width * length);
    }
}