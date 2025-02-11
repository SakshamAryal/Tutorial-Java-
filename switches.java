import java.util.Arrays;
import java.util.Scanner;

public class switches {
    public static int main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // roman number to integer

        // Declaring variables
        String roman;
        String ROMAN = "IVXLCDM";
        // int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;

        // getting input and verifying the roman digits
        while (true) {
            System.out.print("Enter the roman numbers: ");
            roman = scanner.nextLine().toUpperCase();
            if (ValidInput(roman, ROMAN)) {
                break;
            } else {
                System.out.println("Please only use Roman Numbers");
            }
        }

        // converting the input to another array of integers
        // int[] numbers = new int[roman.length()];

        // for (int i = 0; i < roman.length(); i++) {
        // numbers[i] = number(roman, i);
        // }

        // checking the subtraction order

        for (int i = 0; i < roman.length(); i++) {
            if (i + 1 >= roman.length()) {
                break;
            } else if (!check(roman, i)) {
                System.out.println("The subtraction order of the numbers is incorrect.");
                return 1;
            }
        }

        // Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));

        // closing scanner
        scanner.close();
        return 0;
    }

    // verify the input

    public static boolean ValidInput(String a, String b) {
        for (char c : a.toCharArray()) {
            if (!b.contains(String.valueOf(c))) {
                System.out.println("Please only enter the roman digits");
                return false;
            }
        }
        return true;
    }

    // verify the order of the roman digits
    public static boolean check(String a, int j) {
        char b = a.charAt(j);
        char c = a.charAt(j + 1);
        switch (b) {
            case 'M':
            case 'C':
                switch (c) {
                    case 'D':
                        return true;
                    case 'M':
                        return true;
                }
            case 'X':
                switch (c) {
                    case 'L':
                        return true;
                    case 'C':
                        return true;
                }
            case 'I':
                switch (c) {
                    case 'I':
                        return true;
                    case 'V':
                        return true;
                    case 'X':
                        return true;
                    default:
                        return false;
                }

            case 'D':
                switch (c) {
                    case 'D':
                        return true;
                    case 'C':
                        return true;
                }

            case 'L':
                switch (c) {
                    case 'L':
                        return true;
                    case 'X':
                        return true;
                }
            case 'V':
                switch (c) {
                    case 'I':
                        return true;
                    case 'V':
                        return true;
                    default:
                        return false;
                }
            default:
                return false;
        }
    }
}
