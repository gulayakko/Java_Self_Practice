package day02_practice_tasks;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName;
        employeeName = "Shay";
        int age;
        age = 24;
        char ch1 = 'F';
        String companyName;
        companyName = "Apple Inc";
        String jobTitle;
        jobTitle = " SDET ";
        double yearsOfExperience;
        yearsOfExperience = 2.5;
        String salary;
        salary = "120000.0";

        boolean isFullTime;
        isFullTime = true;
        boolean isMarried;
        isMarried = false;
        String employeeId;
        employeeId = "B101";

        System.out.println();
        System.out.println(" Employee name: " + employeeName );
        System.out.println(" Gender: " + ch1 );
        System.out.println(" Age: " + age );
        System.out.println(" Employee ID: " + employeeId );
        System.out.println(" Job title: " + jobTitle );
        System.out.println(" Company name: " + companyName );
        System.out.println(" Full time: " + isFullTime );
        System.out.println(" Years of work experience: " + yearsOfExperience + " " + "years" );
        System.out.println(" Salary: $" + salary );
        System.out.println(" Married: " + isMarried );
    }
}
