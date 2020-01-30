package Lab4;
public class MaxMin {
    public static void main(String[] args){
        int n = args.length;
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(args[i]);
        }
        int max=0, min =9999;
        for(int i=0 ;i < n ; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(max+ " "+ min);
    }
}
