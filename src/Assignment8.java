import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit");
        int limit = sc.nextInt();
        int sum=0;
        for(int i=1;i<=limit;i++){
            if (i % 2 != 0) {
                sum+=i;
            }
            }

        System.out.println(sum);
        }

    }

