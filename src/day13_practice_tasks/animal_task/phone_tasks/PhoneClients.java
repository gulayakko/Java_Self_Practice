package day13_practice_tasks.animal_task.phone_tasks;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 15", "6.3 inches", 1099.99, "Black");
        Samsung samsung = new Samsung("Galaxy S23", "6.5 inches", 999.99, "White");
        Nokia nokia = new Nokia("Flip", "3.4 inches", 59.99, "Gray");

        System.out.println("IPhone:");
        System.out.println(iPhone);
        iPhone.call("0102334567");
        iPhone.text("0102334567");

        System.out.println("Samsung:");
        System.out.println(samsung);
        samsung.call("123456778");

        System.out.println("Nokia:");
        System.out.println(nokia);
        nokia.text("23456789908");


    }

}
