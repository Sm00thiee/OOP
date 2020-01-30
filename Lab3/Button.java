package Labwork3.ex5;

public class Button {
    String label;
    String color;

    void setLabel(String label) {
        this.label = label;
    }

    void setColor(String color) {
        this.color = color;
    }

    void dePress() {
        System.out.println("The button is pressed");
    }

    void unDepress() {
        System.out.println("The button is released");
    }
}
