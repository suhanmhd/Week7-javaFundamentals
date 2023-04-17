import java.util.Scanner;

public class Assignment17 {

    public  void addition(int a, int b)
    {
        int sum = a+b;
        System.out.println("sum is "+sum);

    }
    public  void subtraction(int a, int b){
        int diff = a-b;
        System.out.println("diff is "+diff);

    }
    public  void multiplication(int a, int b){
        int mul = a*b;
        System.out.println("product is "+mul);

    }
    public  void division(int a, int b){
        int div = a/b;
        System.out.println("div is "+div);

    }








    public static void main(String[] args) {
        Assignment17 obj = new Assignment17();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Select operation");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                obj.addition(num1,num2);
                break;
            case 2:
                 obj.subtraction(num1,num2);
                break;
            case 3:
                obj.multiplication(num1,num2);
                break;
            case 4:
                obj.division(num1,num2);
                break;

            default:
                System.out.println("Invalid Entry");
        }
    }
}
