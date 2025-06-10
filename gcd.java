import java.util.*;
public class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res=1;;
        for(int i=Math.min(n1,n2);i>=1;i--){
           if(n1%i==0 && n2%i==0) {
            res=i;
            break;
           }
        }
        System.out.println("Gcd of the given numbers:"+res);
    }

}