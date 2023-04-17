import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the values of the array");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
           int count =0;
        for (int i=0;i<size;i++){
            if(arr[i]%2==0){
                count++;
            }
        }

        System.out.println(count);


    }
}
