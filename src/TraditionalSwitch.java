public class TraditionalSwitch {
    public static void main(String[] args) {
        int value = 5;
        switch (value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Value was either 4, 5, or 6");
                System.out.println("Actual Value was "+ value);
                break;
            default:
                System.out.println("Value is greater than 3");
                break;
        }
    }
}
