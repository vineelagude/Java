public class CheckPrimeOrNot {
    public static void main(String[] args) {
        int number = 9, count = 0;
        if (number % 2 == 0) {
            System.out.printf("not prime");
        }
        else {
            for (int i = 3; i < number / 2; i++) {
//                System.out.println(i);
//            System.out.println(number%i);
                if (number % i >= 1) {
                    count++;
//                    System.out.println(count);
//                    break;
                }
                if(count==1){
                    break;
                }
            }
//           System.out.println(count);
            if (count == 0) {
                System.out.printf("prime");
            } else {
                System.out.printf("not prime");
            }
        }
    }
}
