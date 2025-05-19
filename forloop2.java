public class forloop2{
   public static void main(String args[]){
    int num[]={1,1,3,4,7,2,1,5,9,1};
    int count=0;
    for(int i=0;i<num.length;i++){
        if(num[i]==1){
            count++;
        }
     
    }
    System.out.println("count of 1's:"+count);
   }
}