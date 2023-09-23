import java.util.Scanner;

public class loop_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number;");
        int n = sc.nextInt();
        int product=1;
        while(n>0){
            int last=n%10;
            product=product*last;
            n=n/10;
        }
        System.out.println(product);

    }
}


