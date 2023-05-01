package day26_statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public int grade;
    public String batchNumber;
    public String groupNumber;
    //Statics
    public static String schoolName;
    public static String magicWord;

    public CydeoStudent(String name, int age, char gender, String id, int grade, String batchNumber,
                        String groupNumber, String schoolName, String magicWord){
        this.name =name;
        this.age = age;
        this.gender = gender;
        this.id=id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.schoolName = schoolName;

    }

}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */