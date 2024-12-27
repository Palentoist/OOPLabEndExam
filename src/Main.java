import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter details for Ali's One Session Registration:");
        System.out.print("CNIC: ");
        String aliCnic = scanner.nextLine();
        System.out.print("Name: ");
        String aliName = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String aliMobile = scanner.nextLine();
        System.out.print("Session Date: ");
        String aliSessionDate = scanner.nextLine();
        System.out.print("Session Charges: ");
        double aliSessionCharges = scanner.nextDouble();
        scanner.nextLine(); 

        OneSessionRegistration ali = new OneSessionRegistration(aliCnic, aliName, aliMobile, aliSessionDate, aliSessionCharges);

        System.out.println("Enter details for Usman's Full Course Registration:");
        System.out.print("CNIC: ");
        String usmanCnic = scanner.nextLine();
        System.out.print("Name: ");
        String usmanName = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String usmanMobile = scanner.nextLine();
        System.out.print("Number of Classes: ");
        int usmanClasses = scanner.nextInt();
        System.out.print("Course Fee: ");
        double usmanFee = scanner.nextDouble();

        FullCourseRegistration usman = new FullCourseRegistration(usmanCnic, usmanName, usmanMobile, usmanClasses, usmanFee);

        System.out.println("\nAli's Registration:");
        ali.show();
        System.out.println("\nUsman's Registration:");
        usman.show();

        scanner.close();
    }
}