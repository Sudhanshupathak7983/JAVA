import java.util.Scanner;

public class string_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        String s=sc.nextLine();
        int word=0;
        char ch;
        for (int i =0;i<s.length();i++) {
            ch = s.charAt(i);
            if (ch <= 'a' || ch >= 'z' || ch <= 'A' || ch >= 'Z') {
                word++;

            }
        }
            System.out.println("word="+word);
        }
    }
