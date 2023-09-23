import java.util.Scanner;

public class string_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String s= sc.nextLine();
        int vowel=0;
        int cons=0;
        char ch;
        for (int i =0;i<s.length();i++) {
            ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
            else {
                cons++;
            }
        }
        System.out.println("vowel="+vowel);
        System.out.println("consonant="+cons);
    }
}
