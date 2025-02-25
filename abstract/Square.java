public class Square extends shape {
    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    double area() {
        return length * length;
    }

    @Override
    void printarea() {
        System.out.println("The area of the square is " + area());
    }

}
