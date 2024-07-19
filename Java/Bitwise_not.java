import java.util.Scanner;

public class Bitwise_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Num1: ");
        int num = scan.nextInt();

        System.out.printf("Bitwise Operation:\n~ %d = %d\n",num,(~num));
    }
}


