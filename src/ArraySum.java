public class ArraySum {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,2,3,5,3,5};
        int sum=0,i;
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
