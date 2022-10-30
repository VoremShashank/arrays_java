public class recurrsivebinary {
     static int Findelement(int arr[], int x, int low, int high){
        if(low>high){
            return -1;
        }
        int mid=low+ (high-low)/2;
        if( arr[mid]==x){
            return mid;
        }
        if (arr[mid]>x)
            return Findelement(arr, x, low, mid-1);

        
        else if(arr[mid]<x)
            return Findelement(arr, x, mid+1, high);

        return -1;
        }
    
    
    public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int n=arr.length;
        int high=n;

		int x = 50;

        System.out.println(Findelement(arr,x,0, high));
    } 
}
