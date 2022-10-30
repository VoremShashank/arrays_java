public class pairs_in_array {
    public static void pairs(int arr[], int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("("+ arr[i]+","+arr[j]+")");
                temp=temp+1;
            }
            
        }
        System.out.println(temp);

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        pairs(arr,n);
       
    }
    
}
