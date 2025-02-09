import java.util.Scanner;

public class user_input{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);

        scanner.close();
    }
}