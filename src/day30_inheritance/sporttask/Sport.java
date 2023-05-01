package day30_inheritance.sporttask;

public class Sport {

    private String name, rules;
    private int numberOfPlayers, numberOfReferees,
                homeTeamScore, awayTeamScore;

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        this.name = name;
        this.rules = rules;
        if(numberOfPlayers>0) {
            this.numberOfPlayers = numberOfPlayers;
        }
        else{
            System.out.println("Invalid number of players");
        }
        if(numberOfReferees>0) {
            this.numberOfReferees = numberOfPlayers;
        }
        else{
            System.out.println("Invalid number of players");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers>0) {
            this.numberOfPlayers = numberOfPlayers;
        }
        else{
            System.out.println("Invalid number of players");
        }
    }

    public int getNumberOfReferees() {
        return numberOfReferees;
    }

    public void setNumberOfReferees(int numberOfReferees) {
        if(numberOfReferees>0) {
            this.numberOfReferees = numberOfPlayers;
        }
        else{
            System.out.println("Invalid number of players");
        }
    }

    public void play(){
        System.out.println("The sport is being played!");
    }

    public void finalScore(){
        System.out.println("The final score is HomeTeam: "+getHomeTeamScore()+", AwayTeam: "+getAwayTeamScore());
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
