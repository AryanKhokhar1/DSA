public class bitwiseand {
    static int bitcount(int num){
        int count = 0;
        while(num!=0){
            int ans = num&1;
            if(ans == 1){
                count += 1;
            }
            num = num>>1;
        }
        return count;
    }
    static int and(int a, int b){
        int ans1 = bitcount(a);
        int ans2 = bitcount(b);
        return ans1 + ans2;
    }
    public static void main(String[] args) {
        System.out.println("Value: "+and(3,2));
    }
}
