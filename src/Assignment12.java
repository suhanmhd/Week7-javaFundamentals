import java.util.Arrays;
import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the values of the array");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        for (int i=0;i<size;i++){
          for(int j=1;j<size-i;j++){
              if(arr[j]>arr[j-1]){
                  int temp = arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;

              }
          }
            }


        System.out.println(Arrays.toString(arr));


    }
}
