public class ReverseArrayElementsUsingRecurssion {
         static void reverseArray(int arr[],int start,int end){
            int temp;
            if (start >= end)
                return;

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverseArray(arr, start + 1, end - 1);
        }

        static void printArray(int arr[],int n){
            for(int i = 0;i < n; i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            int arr[] =  new int[]{2,3,4,5,6,7};
            reverseArray(arr,0,arr.length-1);
            printArray(arr,arr.length);

        }
    }


