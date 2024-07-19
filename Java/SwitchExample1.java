import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of a: ");
        int a = scan.nextInt();

        System.out.print("Value of b: ");
        int b = scan.nextInt();

        System.out.print("Operation: ");
        String operation = scan.next();
        System.out.println();
        switch (operation) {
            case "+":
                System.out.println("Addition of a and b: "+(a+b));
                break;
            case "-":
                System.out.println("Subtraction of a and b: "+(a-b));
                break;
            case "*":
                System.out.println("Multiplication of a and b: "+(a*b));
                break;
            case "/":
                System.out.println("Division of a and b: "+(a/b));
                break;
            default:
                System.out.println("Enter a valid Operation");
                break;
        }
    }
}
