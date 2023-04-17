import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Mark of Written test");
       float writtentest = sc.nextInt();
        System.out.println("Enter the Mark of Lab exams");
        float labexam = sc.nextInt();
        System.out.println("Enter the Mark of Assignments");
        float assignments = sc.nextInt();

        float grade =  (writtentest*70)/100 + (labexam*20)/100 + (assignments*10)/100;

        System.out.println("Grade of the student is "+grade);
    }
}
