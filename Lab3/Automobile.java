package Labwork3.ex6;

public class Automobile {
    static double fuel;
    static double speed;
    static String license;
    static void init(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }
    void accelerate(double v) {
        if (fuel > 0) speed += v;
    }
    void decelerate(double v) {
        if (fuel <= 0) speed -= v;
    }
}
