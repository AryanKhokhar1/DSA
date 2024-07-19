import java.util.Scanner;

public class Bitwise_and {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Num1: ");
        int num1 = scan.nextInt();
        System.out.print("Num2: ");
        int num2 = scan.nextInt();

        System.out.printf("Bitwise Operation:\n%d & %d = %d\n",num1,num2,(num1&num2));
        
    }
}