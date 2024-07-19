import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();

        int i = 1;
        for(;;){ // for loop without any argument
            if(i<=num){
                System.out.println(i);
            }else{
                break;
            }
            i++;
        }


        // for loop with multiple variable
        for(int a = 0, b = 1; a<=5 && b<=8; a++, b++){
            System.out.println(a+" "+b);
        }
    }
}
