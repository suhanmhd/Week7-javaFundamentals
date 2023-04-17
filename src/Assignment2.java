import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number:");
        float num2 = sc.nextFloat();

        float sum = num1+num2;
        System.out.println("The Sum is :"+sum);

    }
}
