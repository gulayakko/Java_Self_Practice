package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Gulay", 30, 'F', "Software Engineer", 70000.0);
        Employee emp2 = new Employee("Ezgi", 28, 'F', "Data Analyst", 60000.0);
        Employee emp3 = new Employee("Lisa", 30,'F', "Developer", 120000.0);


        emp1.work();
        emp2.work();
        emp3.work();

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
