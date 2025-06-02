import java.util.*;
public class digitreversing{
    public static void reverse(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            res=(res*10)+rem;
        }
        System.out.println("reverse of the digit :"+res);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        reverse(n);
    }
}