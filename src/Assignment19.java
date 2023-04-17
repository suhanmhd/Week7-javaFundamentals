import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Annual Income");
        int income = sc.nextInt();

        if(income>1000000&&income<=5000000){
            float tax=(income*30)/100;
            System.out.println("Income Tax is "+tax);
        }
        else if(income>500000&&income<=1000000){
            float tax =(income*20)/100;
            System.out.println("Income Tax is "+tax);
        }
        else if(income>250000&&income<=500000){
            float tax = (income*5)/100;
            System.out.println("Income Tax is  "+tax);
        }
        else if(income<=250000){
            System.out.println("No Tax");
        }

    }
}
