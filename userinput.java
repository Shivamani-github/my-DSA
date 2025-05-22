import java.util.*;
class userinput{
     public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println("input number: "+num);
     }
}