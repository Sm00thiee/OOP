package Lab4;
import java.util.Scanner;
public class LongestRun {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: "); int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter a[" + i + "]: "); a[i] = scan.nextInt();
        }
        int temp = a[0],best_count = 0,count=0,best=0;
        for(int i=0;i<n;i++){
            if(temp==a[i]){
                count++;
            }
            else{
                count=1;
                temp=a[i];
            }
            if(count > best_count){
                best_count=count;
                best = a[i];
            }
        }
        System.out.println("Longest run: "+best_count+" consecutive: "+ best);
    }
}
