package Lab4;
import java.util.Scanner;
public class Closet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        double closet=Double.POSITIVE_INFINITY,distance = 0,a,b,c,b_a = 0,b_b = 0,b_c=0;
        int n=3;
        for(int i=0;i<n;i++){
            System.out.print("Enter test x,y,z: ");
            a= scan.nextDouble(); b= scan.nextDouble(); c= scan.nextDouble();
            distance = (x-a)*(x-a)+(y-b)*(y-b)+(z-c)*(z-c);
            if(closet>distance){
                closet=distance;
                b_a=a;
                b_b=b;
                b_c=c;
            }
        }
        System.out.println("Closet point: ("+b_a+","+b_b+","+b_c+")\n\t Distance = "+closet);
    }
}
