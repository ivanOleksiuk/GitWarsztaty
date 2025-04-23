package MinorProjects;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        System.out.println("\n1.Convert lbs to kg\n2.Convert kg to lbs");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        double weight = 0;
        if (choice == 1) {
            System.out.println("Enter weight in lbs");
             weight = sc.nextDouble();
             double newWeight =  weight *0.45;
            System.out.printf("%.0f lbs converts to %.0f kg",weight, newWeight);
        } else if (choice == 2) {
            System.out.println("Enter weight in kg");
             weight = sc.nextDouble();
            double newWeight =  weight *2.20;
            System.out.printf("%.2f kg converts to %.2f lbs",weight, newWeight);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
