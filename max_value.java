import java.util.*;
public class max_value {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);

        int a = in.nextInt ();
        int b= in.nextInt ();
        int c =in.nextInt ();

        int max=Math.max (c,Math.max (a,b));

        System.out.println (max);
    }
}
