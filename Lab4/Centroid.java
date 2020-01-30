package Lab4;
import java.util.Scanner;
public class Centroid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double m = 0;
        double x = 0.0;
        double y = 0.0;
        for(int i=0;i<n;i++){
            System.out.println("Enter x,y,m: ");
            x += scan.nextDouble(); y += scan.nextDouble(); m += scan.nextDouble();
        }
        System.out.println("The centroid: ("+(x/m)+", "+(y/m)+", "+m+")");
    }
}
