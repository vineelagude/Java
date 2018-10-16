public class NumberIsSumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        int number = 10,buf=1;
        for (int i = 1; i <= number; i++){
            buf = number -  i;
            if(isPrime(buf) && isPrime(number-buf)){
//                System.out.println(buf);
//                System.out.println(number-buf);
                System.out.print("yes");
                break;
            }
            System.out.println();
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
