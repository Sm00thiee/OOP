package Lab4;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count =1;
        String str = scan.nextLine();
        char c[]= str.toCharArray();
        System.out.println(str);
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
