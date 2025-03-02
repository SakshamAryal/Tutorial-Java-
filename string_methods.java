public class string_methods {

    public static void main(String[] args) {

        String name = "  Java string";

        int length = name.length(); // to find the string length
        char letter = name.charAt(9);// to find the character at certain index of array
        int index = name.indexOf(" ");// to find the first index of the character in a string
        int LastIndex = name.lastIndexOf("a");// to find the last index of character
        boolean empty = name.isEmpty();
        boolean spaces = name.contains(" ");

        if (empty & spaces) {
            System.out.println(" ");
        }
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("string", "script");

        System.out.println(length);
        System.out.println(LastIndex);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(name);

    }

}
