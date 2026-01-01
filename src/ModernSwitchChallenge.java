public class ModernSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(-1));
    }
    public static String printDayOfWeek(int num){
        return switch (num){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                System.out.println(num + " is a invalid input, enter a number from 0 - 6");
                yield "";
            }
        };
    }

}
