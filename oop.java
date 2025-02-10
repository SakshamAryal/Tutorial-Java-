class keyboard {
    public boolean rgb = false;
    public int rgb_brightness = 0;
    public boolean bluetooth = true;
    public int clicking_sound = 0;

    void change_rgb(boolean tf) {
        rgb = tf;
    }

    void brightness(int bright) {
        rgb_brightness = bright;
    }

    void blue(boolean onoff) {
        bluetooth = true;
    }

    void click(int sound) {
        clicking_sound = sound;
    }
}

public class oop {
    public static void main(String args[]) {
        keyboard instance = new keyboard();
        instance.blue(true);
        instance.change_rgb(true);
        instance.brightness(90);
        instance.click(70);

        System.out.println("rgb: " + instance.rgb);
    }

}
