import java.util.Scanner;

public class string_12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String d="";
        char ch;
        for (int i =s.length()-1;i>=0;i--){
            ch  =s.charAt(i);
            d=d+ch;
        }
        System.out.println(d);
        if(d.equals(s)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
