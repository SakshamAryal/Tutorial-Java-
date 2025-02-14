import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // roman number to integer

        // Declaring variables
        String input;
        int output;
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
            input = scanner.nextLine().toUpperCase();

            if (ValidInput(input, ROMAN)) {
                break;
            } else {
                System.out.println("Please only use Roman Numbers");
            }
        }

        char[] Roman = input.toCharArray();
        int length = input.length();

        // Valid order
        for (int i = 0; i < length; i++) {
            if (!repetition(Roman, i)) {
                System.out.println("Repetition invalid.");
                System.exit(2);
            }
            for (int j = i + 1; j < length; j++) {
                if (num.containsKey(Roman[j])) {
                    if (!check(Roman, i, j, num)) {
                        System.out.println("Invalid order.");
                        System.exit(1);
                    }
                }
            }
        }

        output = Addition(num, Roman, length);

        System.out.println(output);

        // closing scanner
        scanner.close();
        System.exit(0);
        ;
    }

    // verify the input

    public static boolean ValidInput(String a, String b) {
        for (char c : a.toCharArray()) {
            if (!b.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(char[] a, int k, int l, HashMap<Character, Integer> n) {
        int initial = n.get(a[k]);
        int compare = n.get(a[l]);
        // for 5,50,500
        if ((initial == 5 || initial == 50 || initial == 500) && initial <= compare) {
            return false;
        }
        // for 1, 10, 100, 1000
        if ((compare > 10 * initial) && (initial == 1 || initial == 10 || initial == 100 || initial == 1000)) {
            return false;
        }

        // for repetition after subtraction
        if (k >= 1 && (initial > n.get(a[k - 1]) && (compare >= initial || compare == n.get(a[k - 1])))) {
            if (compare > n.get(a[l - 1])) {
                return true;
            }
            return false;
        }

        if (k >= 1 && initial == n.get(a[k - 1]) && compare > initial) {
            return false;
        }

        return true;
    }

    // Too many repetitions
    public static boolean repetition(char[] a, int k) {
        if (k > 2 && (a[k] == a[k - 1] && a[k] == a[k - 2] && a[k] == a[k - 3])) {
            return false;
        }
        return true;
    }

    // addition of all input
    public static int Addition(HashMap<Character, Integer> x, char[] y, int z) {
        int i = 0, sum = 0;
        while (i < z) {
            if (i < z - 1 && x.get(y[i]) < x.get(y[i + 1])) {
                sum -= x.get(y[i]);
            } else {
                sum += x.get(y[i]);
            }
            i++;
        }
        return sum;
    }
}
