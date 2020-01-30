public class FivePerLine {
    public static void main (String []args) {
        int x = 5;
        for(int i = 1000; i <= 2000; i++)
        {
            System.out.println(i + "");
            if ((i+1) % x == 0) System.out.println();
        }

    }
}
