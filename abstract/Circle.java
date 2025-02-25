public class Circle extends shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void printarea() {
        System.out.println("The area of the circle is " + area());
    }
}
