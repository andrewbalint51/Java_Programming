package day30_inheritance.sporttask;

public class Baseball extends Sport{



    public Baseball(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        super(name, rules, numberOfPlayers, numberOfReferees);
    }


    public void homeTeamScoresRun(){
        setHomeTeamScore(getHomeTeamScore()+1);
    }

    public void awayTeamScoresRun(){
        setAwayTeamScore(getAwayTeamScore()+1);
    }



}
