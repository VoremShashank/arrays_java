public class reverseusingswap {
    public static void reverse(int arr[]){
        int first =0; int last = arr.length-1;
        int temp;
        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        
        reverse(arr);
       
    }
    
}
