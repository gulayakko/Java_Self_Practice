package day07_practice_tasks;

public class AddressClients {

    public static void main(String[] args) {

        Address Address1 = new Address();

        Address1.buildingNumber = 7925;
        Address1.street = "Jones Branch Dr";
        Address1.city = "Mclean";
        Address1.state = "VA";
        Address1.zipCode = "22022";

        System.out.println(Address1.buildingNumber + Address1.street + "\n" + Address1.city + ", " + Address1.zipCode);

        System.out.println();


    }
}
