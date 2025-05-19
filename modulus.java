public class modulus{
    public static void main(String args[]){
        int arr[]={3,6,2,4,15,18,8,10,21};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println("no.of multiples of 3:"+count);
    }
}