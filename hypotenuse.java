import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length perpendicular: ");
        double p = scanner.nextDouble();

        System.out.print("Enter the length of the base: ");
        double b = scanner.nextDouble();

        double h;

        h = Math.pow(p, 2) + Math.pow(b, 2);
        h = Math.sqrt(h);

        System.out.println("The hypotenuse of the Right angled Triangle is " + h);        

        scanner.close();
    }
}
