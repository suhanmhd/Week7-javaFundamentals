import java.util.Arrays;
import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        int size = sc.nextInt();
          int[]arr1 = new int[size];
          int[]arr2 = new int[size];
        System.out.println("Enter the elements of the first Array");
        for(int i=0;i<size;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the elements of the second Array");
        for(int i=0;i<size;i++){
            arr2[i]= sc.nextInt();
        }
        System.out.println("Array before swapping");
        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));

        for(int i =0;i<size;i++){
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i]= temp;
        }
        System.out.println("Array after swap");
        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));
    }
}
