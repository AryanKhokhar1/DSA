public class nestedswitch {
    public static void main(String[] args) {
        
        int num = 2;
        char n = 'a';

        switch (num) {
            case 1:
                System.out.println("It's Case 1");                
                break;
            case 2:
                System.out.println("It's Case 2");
                switch (n) {
                    case 'a':
                        System.out.println("n is 'a'");
                        break;
                
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("This is case 3");
                break;
            default:
                System.out.println("None of the case executed");
                break;
        }
    }
}
