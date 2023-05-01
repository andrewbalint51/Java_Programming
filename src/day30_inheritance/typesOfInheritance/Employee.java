package day30_inheritance.typesOfInheritance;

import java.time.LocalDateTime;

public class Employee extends Person{

    private String employeeID, jobTitle;
    private int salary;

    public Employee(String name, char gender, LocalDateTime DOB, String employeeID, String jobTitle, int salary) {
        super(name, gender, DOB);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
