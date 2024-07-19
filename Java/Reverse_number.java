import java.util.Scanner;
import java.lang.Math;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        int answer = 0;
        int i = 0;
        while(num!=0){
            int digit = num%10;
            num /= 10;
            answer = (answer*10)+digit;
            i++;
        }
        System.out.println(answer);
    }
}
