package day17_customClass;

public class SalaryCalculator {

    double hourlyRate,
           stateTaxRate,
           federalTaxRate,
           weeklyHours;

    public void setInfo(double HR, double STR, double FTR, double WH){

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
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible
             for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */