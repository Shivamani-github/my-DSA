import java.util.*;
public class Armstrong{
    public static void armstrong(int n){
        int sum=0;
        int dup=n;
        int digits = String.valueOf(n).length();
        while(n>0){
            int ld=n%10;
            sum += Math.pow(ld, digits);
            n=n/10;
        }
        if(sum==dup){
            System.out.println("It is an Armstrong Number"); 
        }
        else{
            System.out.println("It is not an Armstrong Number"); 
        }
       
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        armstrong(n);
    }
}