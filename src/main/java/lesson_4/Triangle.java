package lesson_4;

public class Triangle implements Shape{
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, String borderColor, String fillColor, double c, double b) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public double getPerimeter(){
        return a + b +c;
    }

    @Override
    public double getArea() {
        double s= getPerimeter()/2.0;
        return Math.sqrt(s*(s-a)* (s-b)* (s-c)) ;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
