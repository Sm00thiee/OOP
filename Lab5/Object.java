package Lab5;

public class Object {
}
abstract class Shape extends Object{
    protected double x,y,r,h,area, volumn;
    protected String name;
    public double calArea(){
        return area;
    }
    public double calVolumn(){
        return volumn;
    }
    public abstract String getName();
}
class Point extends Shape {
    public Point(double x,double y){
        this.x = x; this.y =y;
    }
    @Override
    public double calArea() {
        return area=0;
    }

    @Override
    public double calVolumn() {
        return volumn = 0;
    }

    @Override
    public String getName() {
        return name="Point";
    }
}
class Circle extends Point{
    public Circle(double x, double y,double r) {
        super(x, y);
        this.r =r;
    }

    @Override
    public double calArea() {
        return area=(Math.PI)*r*r;
    }
    @Override
    public double calVolumn() {
        return super.calVolumn();
    }
    @Override
    public String getName() {
        return name="Circle";
    }
}
class Cylinder extends Circle{
    public Cylinder(double x, double y, double r,double h) {
        super(x, y, r);
        this.h = h;
    }
    @Override
    public double calArea() {
        return area= Math.PI*2*r+2*Math.PI*r*r;
    }

    @Override
    public double calVolumn() {
        return volumn=super.calArea()*h;
    }
    @Override
    public String getName() {
        return name="Cylinder";
    }
}