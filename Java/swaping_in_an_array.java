public class swaping_in_an_array {
    public static void main(String[] args) {
        
        int[] arr = {2,1,4,3,6,5,8,7,9};
        int sw;
        for(int i=0; i+1<arr.length; i += 2){
            sw = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = sw;
        }
        for(int ele:arr){
            System.out.print(ele+", ");
        }
    }
}
