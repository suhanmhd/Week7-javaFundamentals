import java.util.Arrays;
import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n-1];

        System.out.println("Enter the values of the array");

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        for(int i =0;i<n-1;i++){
            ans[i]= arr[i]*arr[i+1];

        }

        System.out.println(Arrays.toString(ans));

    }
}
