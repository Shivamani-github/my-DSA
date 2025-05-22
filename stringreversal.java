import java.util.*;
public class stringreversal{
    public static void main(String args[]){
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder rev=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
           rev.append(str.charAt(i));
        }
        String reverse=rev.toString();
        System.out.println(reverse);
        sc.close();
    }
}