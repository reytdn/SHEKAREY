import java.security.Provider.Service;

public class DeliveryService{
      String packageType, serviceType;
    double packageWeight;
    double packageCharge;
    double additionals;
    double additionalcharge;


DeliveryService(String  PT, String ST, double PW){
packageType = PT;
serviceType = ST;
packageWeight = PW;


}
public String getpackageType(){
    return packageType;
}
public String getserviceType(){
    return serviceType;
}
public double getpackageWeight(){
    return packageWeight;
}


public void checkpackagetype(){
    if (packageType.equalsIgnoreCase("L") )
        System.out.println("Package Type: Letter");
    else
        System.out.println("Package Type: Box");

}

public void checkserviceType(){
    if (serviceType.equalsIgnoreCase("NDP"))
        System.out.println("Service Type: Next Day Priority");
    else if (serviceType.equalsIgnoreCase("NDS"))
        System.out.println("Servie Type: Next Day Standard");
    else if (serviceType.equalsIgnoreCase("DTWO"))
        System.out.println("Service  Type: 2-Day");
}


public void additionals(){
    if (packageWeight >= 1 && serviceType.equalsIgnoreCase("NDP")){
        additionals = 1.25;
    } else if (packageWeight >=1 && serviceType.equalsIgnoreCase("NDS")){
        additionals = 1.00;
    } else if (packageWeight >= 1 && serviceType.equalsIgnoreCase("DTWO")){
        additionals = 0.50;
    }
}

public void calculatePackageCharge(){
    if (packageWeight > 8 && packageType.equalsIgnoreCase("L")){
        System.out.println("Service is not applicable!");
    } else if (packageWeight <= 8 && packageType.equalsIgnoreCase("L") && serviceType.equalsIgnoreCase("NDP")){
        packageCharge= 12.00;
        System.out.println("Package Charge is: " + packageCharge);
    } else if (packageWeight <= 8 && packageType.equalsIgnoreCase("L") && serviceType.equalsIgnoreCase("NDS")){
        packageCharge = 10.50;
        System.out.println("Package Charge is: " + packageCharge);
    }


    if (packageWeight == 1 && packageType.equalsIgnoreCase("B") && serviceType.equalsIgnoreCase("NDP")){
        packageCharge = 15.75;
        System.out.println("Package Charge is: " + packageCharge );
    } else if (packageWeight == 1 && packageType.equalsIgnoreCase("B") && serviceType.equalsIgnoreCase("NDS")){
        packageCharge = 13.75;
        System.out.println("Package Charge is: " + packageCharge );
    } else if (packageWeight == 1 && packageType.equalsIgnoreCase("B") && serviceType.equalsIgnoreCase("DTWO")){
        packageCharge = 7.00;
        System.out.println("Package Charge is: " + packageCharge );
    } else if (packageWeight > 1 && packageType.equalsIgnoreCase("B") && serviceType.equalsIgnoreCase("NDP")){
        additionals = 1.25;
        packageCharge = 15.75;
        packageWeight = packageWeight - 1;
        additionalcharge = packageWeight * additionals;
        packageCharge = packageCharge + additionalcharge;
        System.out.println("Package Charge is: " + packageCharge );
    } else if (packageWeight > 1 && packageType.equalsIgnoreCase("B") && serviceType.equalsIgnoreCase("NDS")){
        additionals = 1.00;
        packageCharge = 13.75;
        packageWeight = packageWeight - 1;
        additionalcharge = packageWeight * additionals;
        packageCharge = packageCharge + additionalcharge;
        System.out.println("Package Charge is: " + packageCharge );
    } else if (packageWeight > 1 && packageType.equalsIgnoreCase("B") && serviceType.equalsIgnoreCase("DTWO")){
        additionals = 0.50;
        packageCharge = 7.00;
        packageWeight = packageWeight - 1;
        additionalcharge = packageWeight * additionals;
        packageCharge = packageCharge + additionalcharge;
        System.out.println("Package Charge is: " + packageCharge );
    }
    
}

public void displayPackageDetails(){
    System.out.println();
    System.out.println();
    checkpackagetype();
    checkserviceType();
    System.out.println("Your Units/Unit is/are: " + getpackageWeight());
    calculatePackageCharge();
    System.out.println();
    System.out.println();
}

}
