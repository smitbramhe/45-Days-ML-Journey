import java.util.Scanner;

public class StudentMarks {
    public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter english marks: ");
            int english = sc.nextInt();

            System.out.println("Enter maths marks:");
            int maths = sc.nextInt();
            
            System.out.println("Enter science marks:");
            int science = sc.nextInt();
            
            sc.close();
            
            int total = english + maths + science;
            double average = total/3.0;
            double percentage = (total/300.0)*100;

            System.out.println("English marks: "+ english);
            System.out.println("Maths marks: "+ maths);
            System.out.println("Science marks: "+ science);

            System.out.println("Total marks= "+ total);
            System.out.println("Average of marks: "+ average);
            System.out.println("Percentage = "+ percentage);
    
   }
}