public class Fibonacci {
    public static void main(String[] args) {
        int fiblen=10;
        long[] arr=new long[fiblen];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<fiblen;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<fiblen;i++){
            System.out.println(arr[i]);
        }

    }
}
