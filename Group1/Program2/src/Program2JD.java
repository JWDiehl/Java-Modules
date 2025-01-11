import java.util.ArrayList;
import java.util.Scanner;

public class Program2JD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of tenants: ");
        int tenantCount = input.nextInt();
        
        ArrayList<Tenant> tenants = createTenantList(tenantCount);
        displayTenantDetails(tenants);
    }

    private static void displayTenantDetails(ArrayList<Tenant> tenants) {
        if (tenants.isEmpty()) {
            System.out.println("No tenants to display.");
            return;
        }

        System.out.println("\nTenant Details:");
        for (Tenant tenant : tenants) {
            System.out.println("-----------------------------");
            System.out.println("Full Name: " + tenant.fullName());
            System.out.println("Apartment Number: " + tenant.getAptNumber());
            System.out.println("First payment: " + tenant.firstPayment());
            System.out.println("Monthly Payment for Next 11 Months: " + tenant.monthlyPayment());
        }
    }

    private static ArrayList<Tenant> createTenantList(int tenantCount) {
        ArrayList<Tenant> tenants = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        if (tenantCount <= 0) {
            System.out.println("No tenants to add");
            return tenants;
        }

        for (int i = 0; i < tenantCount; i++) {
            System.out.println("\nEnter details for tenant " + (i + 1) + ":");

            System.out.println("FirstName: ");
            String firstName = input.nextLine();

            System.out.println("LastName: ");
            String lastName = input.nextLine();

            System.out.println("Apartment Number: ");
            String aptNumber = input.nextLine();

            System.out.print("Yearly Rent: ");
            int yearlyRent = input.nextInt();
            input.nextLine();

            tenants.add(new Tenant(firstName, lastName, aptNumber, yearlyRent));
        }

        return tenants;
    }
}
