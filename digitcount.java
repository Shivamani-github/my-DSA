import java.util.*;
public class digitcount{
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=sc.nextInt();
       int res=count(n);
       System.out.println("no.of digits:"+res);
   }
}