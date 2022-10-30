public class reverseanarray {
    public static void reverse(int arr[], int n){
      int b[]=new int[n];
      int j=n;
      for(int i=0;i<n;i++){
        b[j-1]=arr[i];
        j=j-1;
      }
      for(int i=0;i<n;i++){
        System.out.print(b[i]+" ");
      }

    
       

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=5;
        reverse(arr, n);
       
    }
    
}
