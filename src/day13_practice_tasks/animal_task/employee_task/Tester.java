package day13_practice_tasks.animal_task.employee_task;

public class Tester extends Employee {
    public Tester(String name, int age, String gender, String employeeId, double salary, String companyName) {
        super(name, age, gender, employeeId, "Tester", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println("Tester " + getName() + " is testing.");
    }

}