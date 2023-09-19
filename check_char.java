import java.util.Scanner;

public class check_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ");
    char ch = sc.next().charAt(0);
    if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
        System.out.println("character");
    }
    else {
        System.out.println("not a character");
    }
    }
}
