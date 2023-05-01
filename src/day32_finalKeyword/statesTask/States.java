package day32_finalKeyword.statesTask;

public class States {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        
        if(name.equals(null)||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name entered: "+name);
            System.exit(1);
        }
        this.name = name;

        if(abbreviation.equals(null)||abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println("Invalid abbreviation entered: "+abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;

        if(politicalParty.equals(null)||politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println("Invalid Political Party entered: "+politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;

        if(governor.equals(null)||governor.isEmpty()||governor.isBlank()){
            System.err.println("Invalid governor entered: "+governor);
            System.exit(1);
        }
        this.governor = governor;

        if(senator.equals(null)||senator.isEmpty()||senator.isBlank()){
            System.err.println("Invalid senator entered: "+senator);
            System.exit(1);
        }
        this.senator = senator;
        
        if(population<1){
            System.out.println("Invalid population entered: "+population);
            System.exit(1);
        }
        this.population = population;

        if(stateTax<0){
            System.out.println("Invalid tax rate entered: "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(null)||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name entered: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.equals(null)||abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println("Invalid abbreviation entered: "+abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.equals(null)||politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println("Invalid Political Party entered: "+politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor.equals(null)||governor.isEmpty()||governor.isBlank()){
            System.err.println("Invalid governor entered: "+governor);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(population<1){
            System.out.println("Invalid population entered: "+population);
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<1){
            System.out.println("Invalid population entered: "+population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.out.println("Invalid tax rate entered: "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()
 */