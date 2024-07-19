public class factorialbyrecursion {
    static int factorial(int num){
        if(num == 1){
            return 1;
        }else{
            return num*factorial(num--);
        }
    }
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }
}
