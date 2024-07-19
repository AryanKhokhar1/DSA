import java.util.Scanner;

public class combination {
    static int fact(int num){
        int ans = 1;
        for(int i = num; i>0; i--){
            ans *= i;
        }
        return ans;
    }
    static int Combin(int n, int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();

        System.out.print("r: ");
        int r = scan.nextInt();

        int ans = Combin(num, r);
        System.out.println("Value of Combination: "+ans);
    }
}
