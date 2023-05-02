package day33_abstraction.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, String id, String jobTitle, int age, char gender, double salary) {
        super(name, id, jobTitle, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching.");
    }
}
