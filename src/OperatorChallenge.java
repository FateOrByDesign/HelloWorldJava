public class OperatorChallenge {
    public static void main(String[] args) {
        double firstDouble = 20;
        double secondDouble = 80;
        double result = (firstDouble + secondDouble) * 100;
        double remainder = result % 40d;
        boolean hasNoRemainder = remainder == 0 ? true : false;
        System.out.println(result + " % 40 has no remainder -> " + hasNoRemainder);
        if (hasNoRemainder == false) {
            System.out.println("got some remainder");
        }
    }
}
