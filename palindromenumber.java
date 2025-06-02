import java.util.*;
public class palindromenumber{
    public static void palindrome(int n){
        int res=0;
        int dup=n;
        while(n>0){
            int rem=n%10;
            n=n/10;
            res=(res*10)+rem;
        }
        if(res==dup){
            System.out.println("It is a palindrome Number"); 
        }
        else{
            System.out.println("It is not a palindrome Number"); 
        }
       
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        palindrome(n);
    }
}