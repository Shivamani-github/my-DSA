import java.util.*;
public class recursion{
   static int count=0;
   static int res=0;
    public static void rec(int n){
        System.out.println(count);
        System.out.println("shiva");
        count++;
        if(count== n){
            return;
        }
        else{
            rec(n);
        }
    }
    public static void rec2(int n){
        System.out.println(n);
        n--;
        if(n == 0){
            return;
        }
        else{
            rec2(n);
        }
    }
    public static void sum(int n){
        res+=n;
        n--;
        if(n == 0){
            System.out.println("sum :"+res);
            return;
        }
        else{
            sum(n);
        }
    }
    public static int fac(int n){
        if(n == 0|| n==1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }

    public static void main(String args[]){
        rec(5);
        rec2(5);
        sum(10);
        int result=fac(5);
        System.out.println("factorial:"+result);
    }
}