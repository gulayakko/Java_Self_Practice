package day13_practice_tasks.animal_task.employee_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("Lisa", 30, "Female", "E123", 70000, "Space Corp");
        Developer developer = new Developer("Carl", 33, "Male", "E456", 80000, "WELL Inc", "Java");
        Teacher teacher = new Teacher("Melody", 28, "Female", "E789", 60000, "Education Academy");
        Driver driver = new Driver("Osman", 38, "Male", "E012", 45000, "Transport Services");

        tester.work();

        developer.work();

        teacher.work();

        driver.work();


    }
}
