import java.util.*;
public class palindrome{
    public static void main(String args[]){
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int flag=1;
        for(int i=0;i<(str.length()/2);i++){
           if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=0;
                break;
           }
        }
        if(flag==1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}