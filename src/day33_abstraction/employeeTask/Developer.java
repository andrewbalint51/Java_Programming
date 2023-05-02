package day33_abstraction.employeeTask;

public class Developer extends Employee{

    private String language;

    public Developer(String name, String id, String jobTitle, int age, char gender, double salary, String language) {
        super(name, id, jobTitle, age, gender, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+" Programming Language ="+language+"}";
    }
}
