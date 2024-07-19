public class test {
    static int power(int num, int p){
        if(p == 0){
            return 1;
        }else{
            return num*power(num,p-1);
        }
    }
    static int binarytoInt(int num){
        int a = 1;
        int ans;
        int n = 0;
        int value = 0;
        while(num != 0){
            ans = a & num;
            System.out.println("Value of ans "+ans);
            if(ans == 1){
                value += power(2,n);
            }
            n++;
            num = num >> 1;
        }
        return value;
    }
    public static void main(String[] args) {
        // int a = 5;
        // int b = 4;
        // if(a++ == 5 || ++b == 5){
        //     System.out.print(a+" "+b);
        // }

        // int a = 8;
        // System.out.println(a&1);

        char[] abc = {'1','2','3','4'};
        int n = -1;
        // while(n>-abc.length+1){
        //     System.out.println(abc[n]);
        //     n--;
        


    
        int a = 11;
        int b = 1;
        System.out.println(binarytoInt(a));
        System.out.println(binarytoInt(b));
    }
}
