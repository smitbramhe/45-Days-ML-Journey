import java.util.Scanner;
public class PercantageCalculator{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of English: ");
        int english = sc.nextInt();

        System.out.println("Enter marks of Maths: ");
        int maths = sc.nextInt();

        System.out.println("Enter marks of Science: ");
        int science = sc.nextInt();

        System.out.println("Enter marks of SST: ");
        int SST = sc.nextInt();

        System.out.println("Enter marks of Marathi: ");
        int marathi = sc.nextInt();

        sc.close();

        int total = english + maths + science + SST + marathi;

      double percentage = (total/500.0)*100;
       System.out.println("Percentage: " + percentage);
    
    }
}