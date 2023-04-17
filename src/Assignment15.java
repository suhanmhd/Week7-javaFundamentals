import java.util.Arrays;
import java.util.Scanner;

public class Assignment15 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

       getArray(arr,size);
      displayArray(arr);




//        for (int i = 0; i < size; i++) {
//
//        }
//
//
//        System.out.println(Arrays.toString(arr));


    }

    public static void getArray(int[] arr, int size) {
        System.out.println("Enter the values of the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] =sc.nextInt();
        }

    }
    public static   void displayArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

}