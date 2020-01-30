package Lab4;

public class Transpose {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = n*i +j;
            }
        }
        System.out.println("Before: ");
        System.out.println("------");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println("------");
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println("\nAfter:\n------");
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------");
    }
}
