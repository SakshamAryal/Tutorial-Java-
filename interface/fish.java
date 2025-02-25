public class fish implements prey, predator {

    @Override
    public void flee() {
        System.out.println("The fish is running away from a shark.");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting other little fish.");
    }
}
