import java.util.Scanner;

public class ncr_gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number (n)");
        int n = sc.nextInt();
        System.out.println("enter number(r)");
        int r = sc.nextInt();
        int fact = 1;
        int fact1=1;
        int fact2=1;
        int r_fact;
        int p_fact;

        if(n>r) {
            for (int i = fact; i <= n; i++) {
                fact = fact * i;
            }

            for (int i = fact1; i <= r; i++) {
                fact1 = fact1 * i;

            }
            int s = n - r;
            for (int i = fact2; i <= s; i++) {
                fact2 = fact2 * i;
            }
             r_fact = fact/(fact1*fact2) ;
            System.out.println(r_fact);
        }

        else {
            System.out.println("r should not be greater than n");

        }
    }
}