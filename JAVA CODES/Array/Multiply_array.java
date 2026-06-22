package Array;
public class Multiply_array {
    public static void main(String[]args){
        int arr[]={10,20,40,2};
        int ans=1;
        int n=arr.length;

        for(int i=0;i<=n-1;i++){
            int value=arr[i];
            ans=ans*value;

        }
        System.out.println(ans);
    }
    
}
