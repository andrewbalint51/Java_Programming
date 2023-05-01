package day25_constructor;

public class SalaryCalculator {
    public static void main(String[] args) {

        SalaryCalculator calc = new SalaryCalculator(57, 8, 25, 45);
        System.out.println(calc);
    }

    double hourlyRate,
            stateTaxRate,
            federalTaxRate,
            weeklyHours;

    public SalaryCalculator(double HR, double STR, double FTR, double WH){

        hourlyRate=HR;
        stateTaxRate=STR;
        federalTaxRate=FTR;
        weeklyHours=WH;

    }

    public double salary(){

        return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
        return salary()*(stateTaxRate/100);
    }

    public double federalTax(){
        return salary()*(federalTaxRate/100);
    }

    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    public String toString(){
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                "}";
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */