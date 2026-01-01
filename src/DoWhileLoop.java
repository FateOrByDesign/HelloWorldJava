import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter number: ");
            num = input.nextInt();
        }while (num < 0);
    }
}
