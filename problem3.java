import java.util.*;
public class problem3 {
    public static void main(String[] args) {
        {


                 int java_course=0, python_course=0, php_course=0;


                    boolean flag=true;
                    while(flag){

                        Scanner sc=new Scanner(System.in);
                        String name= sc.nextLine();

                        String course=sc.nextLine();

                        if (course.equals("java")){
                            java_course++;
                            System.out.println(course+java_course);
                        }
                        else if(course.equals("python")){
                            python_course++;
                            System.out.println(course+python_course);
                        }
                        else if(course.equals("php")){
                            php_course++;
                            System.out.println(course+php_course);
                        }
                        else{
                            System.out.println("check the input u entered 215" +
                                    "6");
                        }
                        System.out.println("again?");
                        String flag1 = sc.nextLine();
                        if(flag1.equals("yes")){
                            flag=true;
                        }
                        else{
                            flag=false;
                        }

            }
        }
    }
}
