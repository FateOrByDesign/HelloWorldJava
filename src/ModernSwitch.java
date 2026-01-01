public class ModernSwitch {
    public static void main(String[] args){
        System.out.println("August is in the " + getQuarter("ddddd") + " of the year");
    }
    public static String getQuarter(String month){
        String nameOfQuarter = switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = "is not a valid input";
                yield month + badResponse;
            }
        };
        return nameOfQuarter;
    }
}


