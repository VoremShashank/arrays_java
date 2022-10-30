public class squareroot {
    public static int  sqrt( int x){
        int i=1;
        while(i*i<=x){
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int x=15;
        System.out.println(sqrt(x));
    }
    
}
