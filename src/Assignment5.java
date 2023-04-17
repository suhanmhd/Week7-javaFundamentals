import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        float mark = sc.nextFloat();

        if(mark>90){
            System.out.println("A Grade");
        }
        else if(mark>80&&mark<89){
            System.out.println("B Grade");
        }
        else if(mark>70&&mark<79){
            System.out.println("C Grade");
        }
        else if(mark>60&&mark<69){
            System.out.println("D Grade");
        }
        else if(mark>50&&mark<59){
            System.out.println("E Grade");
        }
        else {
            System.out.println("Failed");
        }
    }
}
