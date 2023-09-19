import java.util.Scanner;

public  class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        for (int i =0;i<=n;i++){
            if (n%2!=0){
                sum+=i;
                System.out.println(sum);
            }
        }
    }
}
