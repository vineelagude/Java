public class Palindrom {
    public static void main(String[] args) {
        int original=151,reverse=0;
        int number=original;

        while(number!=0){
            int carrier=number%10;
            reverse=reverse*10+carrier;
            number=number/10;
        }
//        System.out.println(reverse);

        if(reverse==original) {
            System.out.printf("palindrome");
        }
    }
}
