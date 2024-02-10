package day11_practice_tasks.restaurant_task;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server[] servers = {
                new Server("Lisa", 29, 15, false),
                new Server("Melody", 28, 10, false),
                new Server("Dondu", 27, 12, false),
                new Server("Gulseren", 26, 20, true),
                new Server("Aysenur", 25, 23, true),
        };

        Chef[] chefs = {
                new Chef("Ali", 23, 35, true),
                new Chef("Veli", 22, 26, false),
                new Chef("Osman", 21, 27, true),
        };


        Restaurant restaurant = new Restaurant("Gulay", "Busan", 5);

        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        System.out.println(restaurant);

    }

}
