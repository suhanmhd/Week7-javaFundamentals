import java.util.Scanner;

public class Assignment22 {

    public void getArray(int[][] arr1, int[][] arr2, int n) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Elements of first 2D array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the Elements of second 2D array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }


    }

    public void addArray(int[][] arr1, int[][] arr2, int[][] arr3, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];

            }

        }

    }

    public void displayArray(int[][] arr3, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D arrays");
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] arr3 = new int[n][n];

        Assignment22 obj = new Assignment22();
        obj.getArray(arr1, arr2, n);
        obj.addArray(arr1, arr2, arr3, n);
        obj.displayArray(arr3, n);


    }
}