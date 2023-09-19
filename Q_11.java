import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int x = n%10;
        while (n != 0) {

            n /= 10;
            ++c;
        }

        System.out.println(c);
    }
}
