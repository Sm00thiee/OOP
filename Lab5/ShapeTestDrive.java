package Lab5;

public class ShapeTestDrive {
    public static void main(String[] args){
        Shape[] shape = new Shape[3];
        shape[0] = new Point(1, 2);
        shape[1] = new Circle(2,2, 4);
        shape[2] = new Cylinder(0, 0, 1, 1);
        for (int i=0; i<shape.length; i++){
            System.out.println(shape[i].getName());
            System.out.println(shape[i].calArea());
            System.out.println(shape[i].calVolumn());
            System.out.println();
        }
    }
}