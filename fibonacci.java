//import java.util.ArrayList;

public class fibonacci {
    public static long iter; // Number of iterations; specified in main's arguments
    //public ArrayList<Integer> fibo_sequence = new ArrayList<Integer>();

    public static void main(String args[]) {
        iter = Integer.parseInt(args[0]);
        fibo(0, 1, 0);
    }

    public static void fibo(long n1, long n2, int flag) {
        int max = flag++;
        long curr = n1 + n2;
        if (flag != iter) {
            if (n1 == 0 && n2 == 1) {
                System.out.println(n1);
                System.out.println(n2);
            }

            max++;
            System.out.println(curr);
            fibo(n2, curr, max);
        }
    }
}