
public class pattern {

    // Main Method
    public static void main(String[] args) {

        // Initializing required number of lines/rows
        int n = 5;

        // Outer loop for the line/row change
        for (int i = n; i >= 1; i--) {

            // Inner loop for the star printing
            for (int j = 1; j <= i; j++) {

                // Printing the star without changing the line
                System.out.print("*");
            }

            // Line/Row change
            System.out.println();
        }
    }

// public class Main{
//   public static void main(String[] puneet){
//     System.out.println("hello world");
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     int a=10;
//     int b=10;
//     int c=15;
//     int s=a+b+c;
//     System.out.print(s);
//   }
// }
// public class Main{
//   public static void main(String[]puneet){
//     byte age=34;
//     System.out.println("the age of pun "+age);
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     System.out.println("hello world");//sout
//   }
// }
// import java.util.Scanner;//******
// public class Main{
//   public static void main(String[] puneet){
//     System.out.println("enter the number");
//     Scanner sc= new Scanner(System.in);
//     System.out.println("enter the no 1");
//     int a=sc.nextInt();
//     System.out.println("enter the no 2");
//     int b=sc.nextInt();
//     int c=a+b;
//     System.out.println("sum " +c);
//   }
// }
// import java.util.Scanner;
// public class Main{
//   public static void main(String[] args){
//         System.out.println("marks and percentage");
//         Scanner s = new Scanner(System.in);
//         System.out.println("total marks");
//     double n=s.nextInt();
//     System.out.println("marks of english");
//     double e=s.nextInt();
//     System.out.println("marks of hindi");
//     double h=s.nextInt();
//     double p=n/100;
//     double g=e+h;
//     double k=g/p;
//     System.out.println(k);


//   }
// }
// public class Main{
//   public static void main(String[] args){
//     System.out.print("welcome to super 150");
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int a=9;
//     int b=7;
//     System.out.println(a++);
//     System.out.println(a);
//     System.out.println(b--);
//     System.out.println(b);
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int a=9;
//     int x=a++ +8 + a-- - --a + --a + ++a;
//     System.out.println(x);
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     int a=9;
//     a*=3;
//     System.out.println(a);
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     int n=39;
//     if (n%2==0){
//       System.out.println("even");

//     }
//     else {
//       System.out.println("odd");
//     }
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     int a=78;
//     int b=34;
//     if(a>b){
//       System.out.println("a is max");

//     }
//     else{
//       System.out.println("bis max");
//     }
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     int a=78;
//     int b=34;
//     int c=56;
//     if(a>=b&&a>=c){
//       System.out.println("a is max");

//     }
//     else if(b>=c&&b>=a){
//       System.out.println(" b is max");
//     }
//     else {
//       System.out.println("c is max");
//     }
//     }
//   }
// import java.util.Scanner;
// public class Main{
//   public static void main(String[] puneet){

//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter marks ");
//     int a=sc.nextInt();
//     if(a>=75){
//       System.out.println("A");

//     }
//     else if(a>=65&&a<75){
//       System.out.println("b");
//     }
//     else if(a>=55&&a<65){
//       System.out.println("c");
//     }
//     else{
//       System.out.println("fail");
//     }

//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int a=5;
//     int i=1;
//     while(i<=a){
//       System.out.println(i);
//       i++;
//     }
//   }
// }
// public class Main{
//   public static void main(String[] puneet){
//     int n=100;
//     int sum=0;
//     int i=1;
//     while(i<=n){

//       sum=sum+i;
//       i++;
//     }
//       System.out.println(sum);


//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=2348;
//     int i=0;
//     while(n>0){
//       int a=n%10;
//       i=i+a;
//       n=n/10;
//     }
//     System.out.println(i);
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=2348;
//     int sum=0;
//     while(n>0){
//       int rem=n%10;
//       sum=sum*10+rem;
//       n=n/10;
//     System.out.println(sum);
//   }
// }
// }
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the name");
//         String a=sc.next();
//         System.out.println("hello puneet"+a);
//     }
// }
///////pattern//////
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     int i=1;
//     while (i<=n){
//       System.out.print("* ");
//       i++;
//     }
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     int r=1;
//     int s=n;
//     while(r<=n){
//       int i=1;
//       while(i<=s){
//         System.out.print("* ");
//         i++;
//       }
//     r++;
//     System.out.println("");
//     }


//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     for(int i=0;i<n;i++){
//       for(int j=0;j<=i;j++){
//         System.out.print("*");

//       }
//       System.out.println();
//     }

//   }
// // }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     int row=1;
//     int star=1;
//     while(row<=n){
//       int i=1;
//       while(i<=star){
//         System.out.print("*");
//         i++;
//       }
//       System.out.println();
//       row++;
//       star++;
//     }
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     for(int i=n;i>0;i--){
//       for(int j=i;j>0;j--){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     int row=1;
//     int star=1;
//     int space=n-1;
//     while(row<=n){
//       int i=1;
//       while(i<=space){
//         System.out.print("  ");//one space good pattern
//         i++;
//       }//star
//       int j=1;
//       while(j<=star){
//         System.out.print("* ");
//         j++;
//       }//next row prep
//       row++;
//       star++;
//       space--;
//       System.out.println();
//   }
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     int row=1;
//     int star=n;
//     int space=0;
//     while(row<=n){
//       int i=1;
//       while(i<=space){
//         System.out.print("  ");//one space good pattern
//         i++;
//       }//star
//       int j=1;
//       while(j<=star){
//         System.out.print("* ");
//         j++;}
//       row++;
//       star--;
//       space+=2;
//       System.out.println();

//   }
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     int n=5;
//     int row=1;
//     int star=1;
//     int space=n-1;
//     while(row<=n){
//       int i=1;
//       while(i<=space){
//         System.out.print("  ");
//         i++;

//       }
//       int j=1;
//       while(j<=star){
//         System.out.print("* ");
//         j++;

//       }
//       System.out.println();

//       row++;
//       star+=2;
//       space--;

//     }
//   }
// }
// import java.util.Scanner;
// public class Main{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int row=1;
//     int star=1;
//     int space=n-1;
//     while(row<=n){
//       int i=1;
//       while(i<=space){
//         System.out.print("  ");
//         i++;

//       }
//       int j=1;
//       while(j<=star){
//         if(j%2==0){
//           System.out.print("! ");
//         }else{
//         System.out.print("* ");}
//         j++;

//       }
//       System.out.println();

//       row++;
//       star+=2;
//       space--;

//     }
//   }
//  }
// import java.util.Scanner;
// public class Main{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     int row=1;
//     int star=1;
//     int space=2*n-3;
//     while(row<=n){
//       int i=1;
//       while(i<=star){


//         System.out.print("* ");
//         i++;

//       }
//       int j=1;
//       while(j<=space){
//          System.out.print("  ");


//         j++;

//       }
//       int k=1;
//       if(row==n){
//         k=2;
//       }
//       while(k<=star){
//         System.out.print("* ");
//         k++;
//       }
//       row++;
//       System.out.println();


//       star++;
//       space-=2;

//     }
//   }
//  }
}
