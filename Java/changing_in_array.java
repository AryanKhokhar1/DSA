public class changing_in_array {

    static void update(int arr[]){

        // Updating 1st position of the array
        arr[0]= 122;
        System.out.println("Printing array in the update method");
        for(int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3};
        update(arr);
        System.out.println("Printing array in the main method");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
