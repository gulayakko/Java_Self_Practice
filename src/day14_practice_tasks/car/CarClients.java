package day14_practice_tasks.car;

import java.util.ArrayList;

public class CarClients {

    public static void main(String[] args) {

        Car[] cars = {new Honda("Honda", "Pilot", 2010, 25000, "White"),
                new Audi("Audi", "Q6", 2014, 32000, "Red"),
                new Honda("Honda", "Accord", 2011, 20000, "White"),
                new Audi("Audi", "O4", 2015, 33000, "Blue"),
                new Audi("Audi", "A7", 2019, 35000, "Black"),
                new Audi("Audi", "Q8", 2018, 40000, "White"),
                new Audi("Audi", "Q5", 2009, 30000, "Purple"),
                new Audi("Audi", "A4", 2011, 30000, "Black"),
                new Honda("Honda", "Civic", 2018, 30000, "Red"),
                new Honda("Honda", "CR-V", 2012, 23000, "Red"),
                new Honda("Honda", "HR-V", 2019, 35000, "Blue"),
                new Tesla("Tesla", "Model Y", 2017, 65000, "Black"),
                new Tesla("Tesla", "Model 3", 2015, 45000, "White"),
                new Tesla("Tesla", "Model X", 2016, 48000, "White"),
                new Tesla("Tesla", "Model X", 2014, 48000, "Blue")
        };
/*
        for (Car car : cars) {
            if ((car instanceof Honda && car.getYear() >= 2010 && car.getYear() <= 2011) ||
                    (car instanceof Audi && car.getYear() >= 2015 && car.getYear() <= 2019) ||
                    (car instanceof Tesla && car.getYear() >= 2015 && car.getYear() <= 2016)) {
                System.out.println(car);
            }




 */


            Car highestPricedCar = cars[0];
            for (Car car : cars) {
                if (car.getPrice() > highestPricedCar.getPrice()) {
                    highestPricedCar = car;
                }
            }
             System.out.println("Highest Priced Car: " + highestPricedCar);

            Car lowestPricedCar = cars[0];
            for (Car car : cars) {
                if (car.getPrice() < lowestPricedCar.getPrice()) {
                    lowestPricedCar = car;
                }
            }
            System.out.println("Lowest Priced Car: " + lowestPricedCar);


            ArrayList<Tesla> teslaCars = new ArrayList<>();

            for (Car car : cars) {
                if (car instanceof Tesla) {
                    teslaCars.add((Tesla) car);
                }
            }

             System.out.println("Tesla Cars: " + teslaCars);



        }


    }



