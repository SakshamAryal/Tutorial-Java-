import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // variables
        int dice, roll;

        System.out.print("Enter the number of dice you want to roll: ");
        dice = scanner.nextInt();

        if (dice == 0) {
            System.err.println("You have to enter a number greater than 0.");
            System.exit(1);
        } else {
            System.out.println("You have rolled " + dice + " dice.");
        }

        for (int i = 0; i < dice; i++) {
            roll = random.nextInt(1, 7);
            printdice(roll);
            System.out.println("You rolled " + roll);
        }
        scanner.close();
    }

    static void printdice(int roll) {
        String die1 = """
                 -------
                |       |
                |   •   |
                |       |
                 -------
                """;
        String die2 = """
                 -------
                |•      |
                |       |
                |      •|
                 -------
                """;
        String die3 = """
                 -------
                |•      |
                |   •   |
                |      •|
                 -------
                """;
        String die4 = """
                 -------
                |•     •|
                |       |
                |•     •|
                 -------
                """;
        String die5 = """
                 -------
                |•     •|
                |   •   |
                |•     •|
                 -------
                """;
        String die6 = """
                 -------
                |•  •  •|
                |       |
                |•  •  •|
                 -------
                """;

        switch (roll) {
            case (1):
                System.out.println(die1);
                break;
            case (2):
                System.out.println(die2);
                break;
            case (3):
                System.out.println(die3);
                break;
            case (4):
                System.out.println(die4);
                break;
            case (5):
                System.out.println(die5);
                break;
            case (6):
                System.out.println(die6);
                break;
            default:
                break;
        }
    }
}
