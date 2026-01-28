public class DeliveryServiceTest{
    public static void main(String[] args){

        DeliveryService Service1 = new DeliveryService("L", "NDP", 7);
        Service1.displayPackageDetails();

        DeliveryService Service2 = new DeliveryService("L", "NDS", 5);
        Service2.displayPackageDetails();

        DeliveryService Service3 = new DeliveryService("B", "NDP", 1);
        Service3.displayPackageDetails();

        DeliveryService Service4 = new DeliveryService("B", "NDS", 1);
        Service4.displayPackageDetails();

        DeliveryService Service5 = new DeliveryService("B", "DTWO", 1);
        Service5.displayPackageDetails();

        DeliveryService Service6 = new DeliveryService("B", "NDP", 5);
        Service6.displayPackageDetails();

        DeliveryService Service7 = new DeliveryService("B", "NDS", 5);
        Service7.displayPackageDetails();

        DeliveryService Service8 = new DeliveryService("B", "DTWO", 5);
        Service8.displayPackageDetails();

    }
}