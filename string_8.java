import java.util.Scanner;

public class string_8 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        System.out.println("enter");
       String s= sc.nextLine();
        int alfa_count=0;
        int num_count=0;
        int special_count=0;
        char ch;
        for (int i =0;i<s.length();i++){
            ch = s.charAt(i);
           if(ch>='a'&&ch<='z'||ch>='A'&&ch<='z'){
               alfa_count++;
           }
           else if (ch>='0'&&ch<='9'){
            num_count++;
           }
           else {
             special_count++;
           }
        }
        System.out.println("alfabates="+alfa_count);
        System.out.println("number="+num_count);
        System.out.println("special="+special_count);
    }
}
