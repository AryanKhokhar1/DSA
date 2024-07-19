public class Max_Min_in_array {
    public static void main(String[] args) {
        
        int[] arr = {4,12,8,10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int element:arr){
            if(element>max){
                max = element;
            }
            if(element<min){
                min = element;
            }
        }
        System.out.println("Minimum Value: "+min);
        System.out.println("Maximum Value: "+max);

    }
}
