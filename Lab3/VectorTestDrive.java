package Labwork3.ex3;

public class VectorTestDrive {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3, 4);
        Vector vector2 = new Vector(5, 6);
        System.out.println("The first vector is: (" + vector1.x + ", " +vector1.y + ")");
        System.out.println("The second vector i: (" + vector2.x + ", " +vector2.y + ")");
        vector1.add(vector2);
        System.out.println("The sum of two vector is: (" + vector1.x + ", " +vector1.y + ")");
        vector1.subtract(vector2);
        System.out.println("The subtraction of two vector is: (" + vector1.x + ", " +vector1.y + ")");
        vector1.multiply(vector2);
        System.out.println("The multiplication of two vector is: (" + vector1.x + ", " +vector1.y + ")");
    }
}
