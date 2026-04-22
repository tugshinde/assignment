
import java.util.*;

public class Q1 {

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;

                }
              
            }  
            //  System.out.print("Pass " + (i + 1) + ": ");
            print(arr);
            System.out.println();

        }

    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={55,3,99,8,7};
        bubblesort(arr);
        print(arr);

    }

}
