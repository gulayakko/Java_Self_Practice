package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

       Item itemName1 = new Item();

       itemName1.itemName = "Phone";
       itemName1.unitPrice = 100;
       itemName1.quantity = 25;

       itemName1.calcCost();

        System.out.println(itemName1);

        Item itemName2 = new Item();

        itemName2.itemName = "PC";
        itemName2.quantity = 30;
        itemName2.unitPrice = 200;

        itemName2.calcCost();

        System.out.println(itemName2);

    }
}
