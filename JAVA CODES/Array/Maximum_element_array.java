package Array;
public class Maximum_element_array {
    public static void main(String[]args){
        int arr[]={10,20,-30,-444,-510,432};
        int n=arr.length;

        int max=arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>max){

                max=arr[i];
            }
        }

        System.out.println(max);
    }
}


