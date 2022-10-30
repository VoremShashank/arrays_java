public class binarysearch{
    public static int Findelement(int arr[], int x, int n){
        int low=0;
        int high=n;
        while(low<high){
         
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if (arr[mid]<x){
                low=mid+1;

            }
            else if (arr[mid]>x){
                high=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int x= 50;
        int n =arr.length;
        System.out.println(Findelement(arr, x, n));
    }
}