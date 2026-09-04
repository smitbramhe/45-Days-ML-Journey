import java.util.Scanner;
public class CGPACalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of MFCS: ");
        float mfcs = sc.nextFloat();

        System.out.println("Enetr marks of CAO: ");
        float cao = sc.nextFloat();

        System.out.println("Enter marks of QM: ");
        float qm = sc.nextFloat();

        float cgpa = (mfcs + cao + qm)/30;
        System.out.println("CGPA=" + cgpa);
        sc.close();
    }
}
// Average = (MFCS + CAO + QM)/3 ........ This is average out of 100 marks.
//  CGPA  is out off 10........... Divide average by 10
          // CGPA = Average/10