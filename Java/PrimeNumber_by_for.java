import java.util.Scanner;

public class PrimeNumber_by_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        boolean p = true;
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                System.out.println(num+" isn't a Prime Number");
                p = false;
                break;
            }
        }
        if(p == true){
            System.out.println(num+" is a Prime Number");
        }
    }
}
