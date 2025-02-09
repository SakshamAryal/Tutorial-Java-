import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        double area = width * length;

        System.out.println("The area of the rectangle is " + area);

        scanner.close();
    }
}
