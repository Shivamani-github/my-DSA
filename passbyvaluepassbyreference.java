import java.util.*;
class Reference{
    int value;
}
public class passbyvaluepassbyreference{
    public static void passbyvalue(int num){
       num=num+90;
    }
    public static void passbyreference(Reference num){
        num.value=num.value+200;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Enter another number");
        int num2=sc.nextInt();
        passbyvalue(num);
        System.out.println("Value of num1(pass by value): "+num);
        Reference obj=new Reference();
        obj.value=num2;
        passbyreference(obj);
        System.out.println("Value of num2(pass by refernce): "+obj.value);
    }
}