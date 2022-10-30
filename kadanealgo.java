public class kadanealgo {
    public static int maxsumarray(int arr[]){
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++){
            currsum=Math.max(arr[i], currsum+arr[i]);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxsumarray(arr));

    }
}
