import java.util.Scanner;

public class Assignment23 {

        public void getArray(int[][] arr1, int n) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Elements of first 2D array");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = sc.nextInt();

                }
            }



        }



        public void displayArray(int[][] arr1, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + " ");

                }
                System.out.println();
            }


        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the 2D arrays");
            int n = sc.nextInt();
            int[][] arr1 = new int[n][n];


            Assignment23 obj = new Assignment23();
            obj.getArray(arr1, n);

            obj.displayArray(arr1, n);


        }

}
