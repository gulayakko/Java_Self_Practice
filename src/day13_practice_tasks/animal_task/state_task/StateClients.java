package day13_practice_tasks.animal_task.state_task;

public class StateClients {
    public static void main(String[] args) {
        Virginia virginia = new Virginia("Republican", "Lisa Bucchi", "Melody Chichi", 8535519);
        California california = new California("Democratic", "Findik Yildiz", "Uzum Uzum", 39538223);
        Texas texas = new Texas("Republican", "Gulay Akko", "Bruce Brich", 29145505);
        Florida florida = new Florida( "Republican", "Ezgi Kandemir", "Jim Kerry", 21538187);


        System.out.println(virginia);

        System.out.println(california);

        System.out.println(texas);

        System.out.println(florida);
    }
}
