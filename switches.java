import java.util.Scanner;

public class switches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // roman number to integer

        // Declaring variables
        String roman;
        String ROMAN = "IVXLCDM";

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

        for (int i = 0; i < roman.length(); i++) {
            if (i + 1 >= roman.length()) {
                break;
            } else if (!check(roman, i)) {
                System.out.println("The subtraction order of the numbers is incorrect.");
                System.exit(1);
            }
        }

        // closing scanner
        scanner.close();
        System.exit(0);
        ;
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
