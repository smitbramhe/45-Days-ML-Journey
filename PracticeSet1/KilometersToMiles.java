import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in kilometers: ");
        float kilometers = sc.nextFloat();

        sc.close();

        float miles = kilometers * 0.621f;
        System.out.println(kilometers+ " KM = " +miles + " Miles ");
}
}
