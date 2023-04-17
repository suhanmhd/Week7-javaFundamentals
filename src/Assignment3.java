import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
         int p = sc.nextInt();
        System.out.println("Enter the Interest rate:");
        float r = sc.nextFloat();
        System.out.println("Enter the number of years:");
        float n = sc.nextFloat();
        float SI = (p*r*n)/100;

        System.out.println("simple interest is:"+SI);
    }
}
