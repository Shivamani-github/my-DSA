import java.util.*;
public class pattern{
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
    }
    public static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
    } 
    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
     }
    }
    public static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
    } 
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*n-(2*i+1));k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void pattern9(int n){
        for(int i=0;i<=(2*n-1);i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
           for(int j=0;j<stars;j++) {
              System.out.print("*");
            }  
           System.out.print("\n");
        }
    }
    public static void pattern10(int n){
        int start=1;
        for(int i=0;i<n;i++){
           if(i%2==0){
            start=1;
           }
           else{
            start=0;
           }
           for(int j=0;j<i;j++){
             System.out.print(start);
             start=1-start;
           }
           System.out.print("\n");
        }
    }
    public static void pattern11(int n){
        int start=1;
        for(int i=0;i<n;i++){
           for(int j=0;j<i;j++){
             System.out.print(start);
             start=1+start;
           }
           System.out.print("\n");
        }
    }
    public static void pattern12(int n){
        int space=2*(n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.print("\n");
            space-=2;
        }
    }
    public static void pattern13(int n){
       for(int i=0;i<n;i++){
        char a='A';
        for (int j=0;j<i;j++){
            System.out.print(a);
            a+=1;
        }
        System.out.print("\n");
       }
    }
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            char a='A';
            for(int j=n;j>i;j--){
                System.out.print(a);
                a+=1;
            }
            System.out.print("\n");
        }
    }
    public static void pattern15(int n){
        char a='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
            }
            System.out.print("\n");
            a++;
        }
    }
    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            char a='A';
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int breakp=(2*i+1)/2;
            for(int k=0;k<(2*i+1);k++){
                System.out.print(a);
                if(k<breakp){
                    a++;
                }
                else{
                    a--;
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void pattern17(int n){
        char e='F';
        for(int i=0;i<n;i++){
            e-=i;
            for(int j=0;j<i;j++){
                System.out.print(e);
                e++;
            }
            System.out.print("\n");
        }
    }
    public static void pattern18(int n){
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++){
            System.out.print("*");
           }
           for(int j=0;j<i*2;j++){
              System.out.print(" ");
           }
           for(int j=0;j<n-i;j++){
            System.out.print("*");
           }
           System.out.print("\n");
        }
        int space=2*(n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
            space-=2;
        }
    }
    public static void pattern19(int n){
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
             int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n){
                space-=2;
            }
            else{
                space+=2;
            }
            System.out.print("\n");
        }
    }
    public static void pattern20(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void pattern21(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no.of rows:");
       int n=sc.nextInt();
       System.out.println("pattern 1:");
       pattern1(n);
       System.out.println("pattern 2:");
       pattern2(n);
       System.out.println("pattern 3:");
       pattern3(n);   
       System.out.println("pattern 4:");
       pattern4(n);
       System.out.println("pattern 5:");
       pattern5(n);
       System.out.println("pattern 6:");
       pattern6(n);
       System.out.println("pattern 7:");
       pattern7(n);
       System.out.println("pattern 8:");
       pattern8(n);
       System.out.println("pattern 9:");
       pattern9(n);
       System.out.println("pattern 10:");
       pattern10(n);
       System.out.println("pattern 11:");
       pattern11(n);
       System.out.println("pattern 12:");
       pattern12(n); 
       System.out.println("pattern 13:");
       pattern13(n); 
       System.out.println("pattern 14:");
       pattern14(n);                     
       System.out.println("pattern 15:");
       pattern15(n);  
       System.out.println("pattern 16:");
       pattern16(n); 
       System.out.println("pattern 17:");
       pattern17(n);  
       System.out.println("pattern 18:");
       pattern18(n); 
       System.out.println("pattern 19:");
       pattern19(n);
       System.out.println("pattern 20:");
       pattern20(n);
       System.out.println("pattern 21:");
       pattern21(n);                                                               
    }
}