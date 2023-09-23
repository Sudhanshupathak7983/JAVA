import java.util.Scanner;

public class loop_14 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Number;");
            int n = sc.nextInt();
           int sum=0;
           while(n>0){
               int last=n%10;
               sum=sum+last;
               n=n/10;
           }
            System.out.println(sum);

        }
    }


