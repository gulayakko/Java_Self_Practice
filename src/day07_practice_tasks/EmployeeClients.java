package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Lisa";
        employee1.age = 29;
        employee1.gender = 'W';
        employee1.jobTitle = "SDET";
        employee1.salary = 10.000;


        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle);
        System.out.println("Salary: " + employee1.salary);

        employee1.work();

        System.out.println(employee1);

        Employee employee2 = new Employee();

        employee2.name = "Melody";
        employee2.age = 28;
        employee2.gender = 'F';
        employee2.jobTitle = "SDET";
        employee2.salary = 10.000;

        System.out.println("Name: " + employee2.name);
        System.out.println("Age: " + employee2.age);
        System.out.println("Gender: " + employee2.gender);
        System.out.println("Job Title: " + employee2.jobTitle);
        System.out.println("Salary: " + employee2.salary);

        employee2.work();

        System.out.println(employee2);


    }


}
