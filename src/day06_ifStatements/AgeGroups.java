package day06_ifStatements;

public class AgeGroups {
    public static void main(String[] args) {

        String group;
        int age = 85;

        if(age>0&&age<3)
        {
            group="infant";
        }
        else if(age>2&&age<6)
        {
            group="Toddler";
        }
        else if(age>5&&age<10)
        {
            group="Kid";
        }
        else if(age>9&&age<13)
        {
            group="Pre-Teen";
        }
        else if(age>12&&age<18)
        {
            group="Teenager";
        }
        else if(age>17&&age<21)
        {
            group="Young Adult";
        }
        else if(age>20&&age<40)
        {
            group="Adult";
        }
        else if(age>39&&age<50)
        {
            group="Young Middle-Aged Adult";
        }
        else if(age>49&&age<55)
        {
            group="Middle-Aged Adult";
        }
        else if(age>54&&age<65)
        {
            group="Very Young Senior Citizen";
        }
        else if(age>64&&age<75)
        {
            group="Young Senior Citizen";
        }
        else if(age>74&&age<85)
        {
            group="Senior Citizen";
        }
        else //if(age>=85)
        {
            group="Old Senior Citizen";
        }

        System.out.println(group);
    }
}
/*
6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement

 */