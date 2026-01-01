public class forLoopChallenge {
    public static void main(String[] args){
        int primeCounter = 0;
        for(int i = 1; i <= 1000; i++){
            if (primeCounter >= 3){
                System.out.println("Breaking out of the loop");
                break;
            }
            if (isPrime(i)){
                System.out.println(i + " is a prime number");
                primeCounter++;
            }
        }
    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber < 2){
            return false;
        }
        else if (wholeNumber == 2){
            return true;
        }
        double limit = Math.sqrt(wholeNumber);
        for (int i = 2; i <=limit; i++){
            if (wholeNumber % i == 0){
                return false;
            }
        }
        return true;
    }
}
