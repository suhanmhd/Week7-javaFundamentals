import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D arrays");
        int n = sc.nextInt();
        int[][]arr1 = new  int[n][n];
        int[][]arr2 = new  int[n][n];
        int[][]arr3 = new  int[n][n];
        System.out.println("Enter the Elements of first 2D array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]= sc.nextInt();

            }
        }
        System.out.println("Enter the Elements of second 2D array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]= sc.nextInt();

            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               arr3[i][j]=arr1[i][j]+arr2[i][j];

            }
            System.out.println();
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print( arr3[i][j]+" ");

            }
            System.out.println();
        }
    }
}
