public class NumberOfPrimes {
    public static void main(String[] args) {
        int number=10,count=0;

        for(int i=0;;i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            if(count==number){
                break;
            }
        }
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2;i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
