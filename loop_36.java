import java.util.Scanner;

public class loop_36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int count=sc.nextInt();
        int n1 = 0, n2 = 1, n3, i;
        System.out.println(n1 + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 % 2 == 0) {
                System.out.println(n3);
            }
        }
    }
}
