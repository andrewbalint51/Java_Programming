package day32_finalKeyword.statesTask;

public class Virginia extends States{

    private int numHillbillies;

    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax, int numHillbillies) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
        if(numHillbillies<0){
            System.out.println("Invalid number of hillbillies entered: "+numHillbillies);
        }
        this.numHillbillies = numHillbillies;
    }

    public int getNumHillbillies() {
        return numHillbillies;
    }

    public void setNumHillbillies(int numHillbillies) {
        if(numHillbillies<0){
            System.out.println("Invalid number of hillbillies entered: "+numHillbillies);
        }
        this.numHillbillies = numHillbillies;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                ", numHillbillies=" + numHillbillies +
                '}';
    }
}
/*
    2. Create the following sub classes of States and add any additional fields and methods if necessary:
            1. Virginia
            2. California
            3. Texas
            4. Florida


 */