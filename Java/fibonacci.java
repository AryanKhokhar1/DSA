public class fibonacci {
    static int fibonacci_nth(int num){
        int a = 0;
        int b = 1;
        // int count = 2;
        int c;
        if(num == 1){
            return 0;
        }
        for(int count = 3; count<=num; count++){
            c = b;
            b = a + b;
            a = c;
        }
        return b;
    }
    public static void main(String[] args) {

        // 0, 1, 1, 2, 3, 5, 8, 13, ...
        System.out.println("Fibonacii Series: "+fibonacci_nth(1));
    }
}
