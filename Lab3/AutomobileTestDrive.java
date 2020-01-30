package Labwork3.ex6;

public class AutomobileTestDrive {
    public static void main(String args[]) {
        Automobile mobile = new Automobile();
        mobile.init(4.5,34,"29JAD");

        mobile.accelerate(4);
        mobile.decelerate(5);
        System.out.println(mobile.speed);
    }
}
