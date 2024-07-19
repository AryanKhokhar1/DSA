import java.util.Scanner;

public class fibonnaci_by_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();

        //fibonacci Series
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a+"\n"+b);
        for(int i = 1; i<=num-2; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
