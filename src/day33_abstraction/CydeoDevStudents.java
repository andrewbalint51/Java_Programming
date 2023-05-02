package day33_abstraction;

import day30_inheritance.typesOfInheritance.Person;

import java.time.LocalDateTime;

public final class CydeoDevStudents extends Person{

    private final String id;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;

    public CydeoDevStudents(String name, char gender, LocalDateTime DOB, String id, String batchName, int batchNumber) {


        super(name, gender, DOB);

        if(getAge()<18){
            System.err.println("Cydeo developer must be 18 years old");
            System.exit(1);
        }



        this.id = id;
        this.batchName = batchName;
        this.batchNumber = batchNumber;


    }

    static{
        programmingLanguage="Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("zero to hero")|| batchName.equalsIgnoreCase("alumni dev")){
            this.batchName = batchName;
        }
        else{
            System.err.println("Invalid batch name: "+batchName+" \n No such batch in Cydeo");

        }

    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<1){
            System.err.println("Invalid Batch Number: "+batchNumber+ " \nBatch number cannot be less than zero.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }
}
