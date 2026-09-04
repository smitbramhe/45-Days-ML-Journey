import java.util.Scanner;
public class SimpleIntrest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of 'P': ");
        int p = sc.nextInt();

        System.out.println("Enter the rate (in %):  ");
        int r = sc.nextInt();

        System.out.println("Enter time (in years): ");
        float t = sc.nextFloat();

        sc.close();

        float result = p * r * t / 100;
        System.out.println("The simple intrest is: " + result);

    }
}
