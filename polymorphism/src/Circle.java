public class Circle implements FigureInterface {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return (2 * PI * radius);
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (PI * radius * radius);
    }


}
