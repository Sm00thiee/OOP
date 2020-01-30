public class RollLoadedDie {
    public static void main  (String []agrs) {
            double a = Math.random();
            int b;

            if (a <= 1.0/8.0) b = 1;
            else if (a <= 2.0/8.0) b = 2;
            else if (a <= 3.0/8.0) b = 3;
            else if (a <= 4.0/8.0) b = 4;
            else if (a <= 5.0/8.0) b = 5;
            else b = 6;

            System.out.println(b);


    }

}
