public class whileLoopChallenge {
    public static void main(String[] args){
        int i = 5;
        int oddCount = 0;
        int evenCount = 0;
        System.out.print("Even Numbers: ");
        while (i < 21){
            if (isEvenNumber(i)){
                System.out.print(i + " ");
                evenCount++;
            }
            else{
                oddCount++;
            }
            i++;
            if (evenCount == 5){
                break;
            }
        }
        System.out.println();
        System.out.println("There are : " + evenCount + " even numbers");
        System.out.println("There are : " + oddCount + " odd numbers");

    }
    public static boolean isEvenNumber(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
}
