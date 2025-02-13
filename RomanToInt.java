import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // roman number to integer

        // Declaring variables
        String roman;
        String ROMAN = "IVXLCDM";
        HashMap<Character, Integer> num = new HashMap<Character, Integer>();
        num.put('I', 1);
        num.put('V', 5);
        num.put('X', 10);
        num.put('L', 50);
        num.put('C', 100);
        num.put('D', 500);
        num.put('M', 1000);

        // input valid as roman numbers
        while (true) {
            System.out.print("Enter the roman numbers: ");
            roman = scanner.nextLine().toUpperCase();
            if (ValidInput(roman, ROMAN)) {
                break;
            } else {
                System.out.println("Please only use Roman Numbers");
            }
        }
        char[] Roman = roman.toCharArray();
        // Valid order
        for (int i = 0; i < roman.length(); i++) {
            if (i + 1 >= roman.length()) {
                break;
            }
            for (int j = i + 1; j < roman.length(); j++) {
                if (!check(Roman, i, j, num)) {
                    System.out.println("The subtraction order of the numbers is incorrect.");
                    System.exit(1);
                }

            }
            System.err.println(num.get(Roman[i]));
        }
        // addition and display
        // int romanToint = RomantoInt(roman);
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
    // public static boolean check(String a, int j, HashMap<String, Integer> n) {
    // char b = a.charAt(j);
    // char c = a.charAt(j + 1);
    // switch (b) {
    // case 'M':
    // case 'C':
    // switch (c) {
    // case 'D':
    // return true;
    // case 'M':
    // return true;
    // }
    // case 'X':
    // switch (c) {
    // case 'L':
    // return true;
    // case 'C':
    // return true;
    // }
    // case 'I':
    // switch (c) {
    // case 'I':
    // return true;
    // case 'V':
    // return true;
    // case 'X':
    // return true;
    // default:
    // return false;
    // }

    // case 'D':
    // switch (c) {
    // case 'D':
    // return true;
    // case 'C':
    // return true;
    // }

    // case 'L':
    // switch (c) {
    // case 'L':
    // return true;
    // case 'X':
    // return true;
    // }
    // case 'V':
    // switch (c) {
    // case 'I':
    // return true;
    // case 'V':
    // return true;
    // default:
    // return false;
    // }
    // default:
    // return false;
    // }
    // }

    // addition of roman numbers
    // public static int RomantoInt(String a){
    // int i = 0, sum = 0;
    // while (i < a.length()){
    // if()
    // }
    // return 0;
    // }

    public static boolean check(char[] a, int k, int l, HashMap<Character, Integer> n) {
        int initial = n.get(a[k]);
        if (n.containsKey(a[l])) {
            int compare = n.get(a[l]);
            if (initial == 5 || initial == 50 || initial == 500) {
                if (initial < compare) {
                    return false;
                }
            } else if (initial == 1 || initial == 10 || initial == 100 || initial == 1000) {
                if (compare > 10 * initial) {
                    return false;
                }
            }
        }
        return true;

    }

}
