package Lab4;
import java.util.Scanner;
import java.lang.Math;

public class Stats {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         double sum1=0.0,sum2=0.0, n = Integer.parseInt(args[0]);
         double a[] = new double[(int) n];
         for(int i=0; i<n ;i++){
             System.out.println("Enter x: ");
             a[i] = scan.nextDouble();
             sum1+=a[i];
         }
         double mean = sum1/n;
         System.out.println(mean);
         for(int i=0;i<n;i++){
             sum2+= Math.pow((a[i]-mean),2);
         }
         double ssd = sum2/(n-1);
        System.out.println(ssd);
    }
}
