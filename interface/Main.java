public class Main {

    public static void main(String[] args) {

        rabbit rabbit = new rabbit();
        hawk hawk = new hawk();
        fish fish = new fish();

        hawk.hunt();
        rabbit.flee();

        fish.flee();
        fish.hunt();

    }
}
