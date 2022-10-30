public class countoccurance {
    public static int Firstelement(int arr[], int x, int n){
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
    public static int lastelement(int arr[], int x, int n){
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
                if((mid==n-1) || arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else {
                    high=mid-1;
                }
            }

            
        }
        return -1;
    }
    public static int Cuntoccurance(int arr[], int x, int n){
        int first=Firstelement(arr, x, n);
        if(first==-1){
            return 0;
        }
        else{
            return(lastelement(arr, x, n)-first+1);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,20,30,30,50};
        int x=30;
        int n=arr.length;
        System.out.println(Cuntoccurance(arr, x, n));
    }
   
}

    

