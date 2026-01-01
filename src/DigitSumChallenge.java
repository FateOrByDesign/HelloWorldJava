public class DigitSumChallenge {
    public static void main(String[] args){
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }
    public static int sumDigits(int num){
        if (num < 1){
            return -1;
        }
        int sum = 0;
        while (num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
