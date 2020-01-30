package Lab4;
import java.util.Scanner;
public class Ex2 {
    private static void BubbleSort(double[] arr) {
        for(int i=0;i<arr.length ;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    private static void print(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    private static void input(double[] arr){
        for(int i=0;i<arr.length;i++){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a["+i+ "]: ");
            arr[i] = scan.nextDouble();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] arr = new double[n];
        input(arr);
        System.out.print("before: ");
        print(arr);
        System.out.println();
        BubbleSort(arr);
        System.out.print("after: ");
        print(arr);
    }
}
