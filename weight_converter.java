import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Weight converter

        // get the unit of measurement

        System.out.print("Which unit of measurement do you want to use?(kg/lbs) ");
        String unit = scanner.nextLine();

        // input check
        while (unit.equalsIgnoreCase("kg") == false && unit.equalsIgnoreCase("lbs") == false) {

            System.out.println("Please enter kg or lbs.");
            System.out.print("Which unit of measurement do you want to use?(kg/lbs) ");
            unit = scanner.nextLine();
        }

        // Declare variables
        double weight;
        double new_weight;
        System.out.print("Enter the weight: ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        // conversion
        if (unit.equalsIgnoreCase("kg")) {

            new_weight = weight * 2.20462;
            System.out.printf("Your desired weight is %.2f lbs", new_weight);

        } else if (unit.equalsIgnoreCase("lbs")) {
            new_weight = weight * 0.453592;
            System.out.printf("Your desired weight is %.2f kg", new_weight);

        }

        scanner.close();
    }

}
