public class reverse_array {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int first;
        for(int i = 0, l= arr.length-1; i<(arr.length/2); i++,l--){
            first = arr[i];
            arr[i] = arr[l];
            arr[l] = first;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
