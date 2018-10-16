public class RearrangeArrayUsingSwapping {
    public static void main(String[] args) {
        System.out.println("hi");
        int arr[]=new int[]{2,-1,-1,3,-1,0};
        int len = arr.length,ele=0;

        for(int i = 0; i <= len-1;){
            if(arr[i]>=0 && arr[i]!=i){
                ele = arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=ele;
            }
            else{
                i++;
            }
        }

        for(int i = 0; i < len ; i++){
            System.out.println(arr[i]);
        }
    }
}
