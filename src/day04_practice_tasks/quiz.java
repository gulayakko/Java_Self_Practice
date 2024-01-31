package day04_practice_tasks;

public class quiz {

    public static void main(String[] args) {
        String information = "Can I vote in this election? ";
        int yourAge = 18;

        information += yourAge > 18 ? "absolutely YES." : "unfortunately," +
                " you should wait a bit.";

        System.out.println(information);
    }
    }


