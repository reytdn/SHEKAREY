import java.util.Scanner;

public class DeliveryServiceTest{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Package Type L or B: ");
        String packageType = input.nextLine();

        System.out.print("Enter Service Type NDP or NDS or DTWO: ");
        String serviceType = input.nextLine();

        System.out.print("Enter Package Weight: ");
        double packageWeight = input.nextDouble();

        DeliveryService Service = new DeliveryService(packageType, serviceType, packageWeight);
        Service.displayPackageDetails();

        input.close();
    }
}