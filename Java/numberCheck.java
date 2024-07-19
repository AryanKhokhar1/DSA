import java.util.Scanner;

public class numberCheck {

    boolean isEven(int num){
        int ans = num&1;
        if(ans == 1){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        numberCheck obj1 = new numberCheck();
        boolean ans = obj1.isEven(num);
        System.out.println(ans);
    }
}
