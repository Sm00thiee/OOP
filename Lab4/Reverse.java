package Lab4;
public class Reverse {
    public static void main(String[] args){
        String[] a = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int n = a.length;
        for( int i =0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("\n\tOver\t\n");
        for(int i =0; i<n/2 ; i++){
            String temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
