package Lab4;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] arr = new double[n];
        double max=Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+ i+"]: ");
            arr[i] = scan.nextDouble();
            if(arr[i]>max){
                max =arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max: "+max+"\nMin: "+min);
    }
}
