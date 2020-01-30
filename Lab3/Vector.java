package Labwork3.ex3;

public class Vector {
    int x, y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void add(int x, int y) {
        this.x += x;
        this.y += y;
    }

    void add(Vector other) {
        this.add(other.x, other.y);
    }

    void subtract(int x, int y) {
        this.x -= x;
        this.y -= y;
    }

    void subtract(Vector other) {
        this.subtract(other.x, other.y);
    }

    void multiply(int x, int y) {
        this.x *= x;
        this.y *= y;
    }

    void multiply(Vector other) {
        this.multiply(other.x, other.y);
    }
}
