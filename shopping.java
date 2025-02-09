import java.util.Scanner;

public class shopping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to buy? ");
        String item = scanner.nextLine();

        System.out.print("Whats the price of " + item + "? ");
        double price = scanner.nextDouble();

        System.out.print("How many " + item + " do you want? ");
        int quantity = scanner.nextInt();

        double total_price = quantity * price ;

        System.out.println("Your total price comes out to " + total_price);


        scanner.close();
    }
}
