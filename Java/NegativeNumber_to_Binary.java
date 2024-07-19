import java.util.Scanner;

public class NegativeNumber_to_Binary {
    static int pow(int num , int p){
        int ans = 1;
        while(p-->0){
            ans *= num;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        int answer = 0;
        int i = 0;
        num = num * (-1);
        while(num != 0){
            int bit = num&1;
            System.out.println(bit);
            answer = (bit*pow(10, i))+ answer;
            num = num >> 1;
            i++;
        }
        answer = (1*pow(10, i))+answer;
        int rev_ans = 0;
        boolean pass_num = true;
        int a = 0;
        while(answer != 0){
            int digit = answer % 10;
            answer /= 10;
            if(digit == 1){
                digit = 0;
            }else{
                digit = 1;
            }
            rev_ans = (digit * pow(10, a))+answer;
            a++;
        }
        System.out.println(answer);
    }
}
