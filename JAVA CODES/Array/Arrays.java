package Array;
public class Arrays{
   public static void main(String[] args){
        int arr[]={4,2,-5,21,15};
        int n=arr.length;
        int max=arr[0];

        for(int i=0;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
        System.out.println("The maximum element in the array is: "+max);
    }
}