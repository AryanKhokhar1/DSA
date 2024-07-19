class Solution {
    static int pow(int num , int p){
        int ans = 1;
        while(p>0){
            ans *= num;
            p--;
        }
        return ans;
    }
    public static void main(String args[]) {
        int n = 5;
        int answer = 0;
        while(n != 0){
            int bit = n & 1;
            answer = (answer*10)+bit;
            n = n >> 1;
        }
        System.out.println("Binary form: "+answer);
        int i= 0;
        int dec = 0;
        while(answer != 0){
            int digit = answer % 10;
            if(digit == 0){
                dec = dec + pow(2,i);
            }
            i++;
        }
        System.out.println(dec);
    }
}
