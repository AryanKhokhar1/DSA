import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("Total Sum of all number: "+sum);
    }
}
