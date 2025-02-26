import java.util.Scanner;

public class mainrun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat ): ");
        input = scanner.nextInt();

        if (input == 1) {
            animal = new Dog();
            animal.speak();
        } else if (input == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Please enter either 1 or 2");
        }

        scanner.close();
    }

}
