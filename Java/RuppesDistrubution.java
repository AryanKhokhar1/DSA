import java.util.Scanner;

public class RuppesDistrubution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ruppes: ");
        int ruppe = scan.nextInt();
            switch (100) {
                case 100:
                    int hundred = ruppe/100;
                    System.out.println("Hundreds: "+hundred);
                    ruppe -= (100*hundred);
                case 50:
                    int fifty = ruppe/50;
                    System.out.println("Fifty: "+fifty);
                    ruppe -= (50*fifty);
                case 20:
                    int Twenty = ruppe/20;
                    System.out.println("Twenty: "+Twenty);
                    ruppe -= (20*Twenty);
                case 10:
                    int ten = ruppe/10;
                    System.out.println("Ten: "+ten);
                    ruppe -= (10*ten);
                case 5:
                    int five = ruppe/5;
                    System.out.println("Fives: "+five);
                    ruppe -= (5*five);
                case 1:
                    int one = ruppe;
                    System.out.println("Ones: "+one);
                    ruppe -= (one);
            }
        }
    }
