public class firstoccurance {
    public static int Findelement(int arr[], int x, int n){
        int low=0;
        int high=n;
        while(low<=high){
         
            int mid=low+(high-low)/2;
            if (arr[mid]<x){
                low=mid+1;

            }
            else if (arr[mid]>x){
                high=mid-1;
            }
            else {
                if((mid==0) || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else {
                    high=mid-1;
                }
            }

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,40,40};
        int x= 40;
        int n =arr.length;
        System.out.println(Findelement(arr, x, n));
    }
}
