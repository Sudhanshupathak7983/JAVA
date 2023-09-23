import java.util.Scanner;

public class loop_17{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number;");
        int n = sc.nextInt();
        int temp=n;
        int reverse =0;
        while(n>0){
            int last=n%10;
            reverse =reverse*10+last;
            n=n/10;
        }
        System.out.println(reverse);
        if(reverse==temp){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
