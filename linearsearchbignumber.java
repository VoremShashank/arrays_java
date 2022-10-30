public class linearsearchbignumber {
    public static int largestnumber(int arr[]){
        int max = arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            
             if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        System.out.println(max);
        return min;
        
    }
    
    public static void main(String[] args) {
        int arr[]={11,10,9,10,20};
        System.out.println(largestnumber(arr));
        
    }
    
}
