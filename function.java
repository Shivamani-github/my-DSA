import java.util.*;
public class function{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to add: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt(); 
        System.out.println(add(num1,num2));
        System.out.println("enter a name and a number");
        String name=sc.next();
        int num=sc.nextInt();
        System.out.println(repeat(name,num));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static String repeat(String nam, int n){
        String ans="";
        for(int i=0;i<n;i++){
            ans=ans+"\n"+nam;
        }
        return ans;
    }

}