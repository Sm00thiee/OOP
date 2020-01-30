package Labwork3.ex5;

public class ButtonTestDrive {
    public static void main(String[] args) {
        Button butt = new Button();
        butt.setColor("Red");
        butt.setLabel("Log Out");
        System.out.println(butt.color);
        System.out.println(butt.label);
        butt. dePress();
        butt.unDepress();
    }
}
