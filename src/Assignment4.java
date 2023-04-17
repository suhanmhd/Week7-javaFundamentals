import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        float mark = sc.nextFloat();

        if(mark>=50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
