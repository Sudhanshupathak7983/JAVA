import java.util.Scanner;

public class sum_of_all_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0;i<=num;i++){
            if (num%2==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
