import java.util.*;
public class recursion2{
    static int res=0;
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
           return fib(n-1) +fib(n-2);
        }
    }     
    public static void reverse(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr, start+1, end-1);
    }
    public static Boolean pali(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
       return pali(str, start+1, end-1);
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number :");
     int n=sc.nextInt();
     System.out.println("Sequence :");
     for(int i=0;i<n;i++){
        System.out.println(fib(i));
     }
     System.out.println("Enter the array size:");
     int s=sc.nextInt();
     int[] arr= new int[s];
     System.out.println("enter "+s+" numbers:");
     for(int i=0;i<s;i++){
        arr[i]=sc.nextInt();
     }
     reverse(arr, 0,s-1);
     System.out.println("reversed array:");
     for(int num:arr){
        System.out.print(num+" ");
     }
     System.out.println("enter a string");
     sc.nextLine();
     String str=sc.nextLine();
     if(pali(str,0,str.length()-1)){
        System.out.println("it is a palindrome");
     }
     else{
        System.out.println("it is not a palindrome");
     }
    } 
}