import java.util.Scanner;

public class Decimal_to_boolean {

    static int pow(int num, int p){
        int mult = 1;
        while(p>0){
            mult = mult * num;
            p--;
        }
        return mult;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        int ans = 0;
        int i = 0;
        while(num != 0){
            int bit = (num&1);
            ans = (bit * pow(10,i))+ans;
            i++;
            num = num >> 1;
        }
        System.out.println("Binary form: "+ans);
    }
}
