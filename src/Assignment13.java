import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        boolean ans=isPalindrome(str);
        System.out.println(ans);


    }
    public  static  boolean isPalindrome(String str){

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;

            }
        }
        return true;
    }
}
