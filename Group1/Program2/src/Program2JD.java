import java.util.ArrayList;
import java.util.Scanner;

public class Program2JD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of tenants: ");
        int tenantCount = input.nextInt();
        
        ArrayList<Tenant> tenants = createTenantList(tenantCount);
        displayTenantDetails(tenants);

        //New Branch
        //Number of tenants
    }

    private static void displayTenantDetails(ArrayList<Tenant> tenants) {
        
    }

    private static ArrayList<Tenant> createTenantList(int tenantCount) {
    }
}
