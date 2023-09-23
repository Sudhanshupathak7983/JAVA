import java.util.Scanner;

public class loop_35 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int fact =1;
        int temp=num;
        int sum =0;
        while (num>0) {
            int last = num % 10;
            System.out.println(last);
            num = num / 10;
        for (int i =1;i<=last;i++) {
            fact = fact * last;
            sum = sum + fact;

        }     }
        System.out.println(sum);

        if(sum==temp){
           System.out.println("strong");

       }
       else {
           System.out.println("not strong");
       }
    }

        }

