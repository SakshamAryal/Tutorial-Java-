public class varargs {

    public static void main(String[] args) {

        System.out.println(average(2, 0.5, 9, 98) / 2);
    }

    static double average(double... numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
