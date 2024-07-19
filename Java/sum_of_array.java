import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = scan.nextInt();

        int arr[] = new int[100];
        System.out.println("Enter elements in array: ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        int summ = 0;
        for(int element: arr){
            summ += element;
        }
        System.out.println("Total sum of all elements in the array: "+summ);
    }
}
