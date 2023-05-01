package day30_inheritance.sporttask;

public class Basketball extends Sport{

    private static int threePointer = 3;
    private static int twoPointer = 2;


    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        super(name, rules, numberOfPlayers, numberOfReferees);
    }

    public static int getThreePointer() {
        return threePointer;
    }


    public static int getTwoPointer() {
        return twoPointer;
    }

    public void threePointer(String homeOrAway){
        if(homeOrAway.trim().equalsIgnoreCase("home")){
            setHomeTeamScore(getHomeTeamScore()+threePointer);
        }
        else if (homeOrAway.trim().equalsIgnoreCase("away")) {
            setAwayTeamScore(getAwayTeamScore()+threePointer);
        }
        else{
            System.err.println("Please specify home or away team");
        }
    }

    public void twoPointer(String homeOrAway){
        if(homeOrAway.trim().equalsIgnoreCase("home")){
            setHomeTeamScore(getHomeTeamScore()+2);
        }
        else if (homeOrAway.trim().equalsIgnoreCase("away")) {
            setAwayTeamScore(getAwayTeamScore()+2);
        }
        else{
            System.err.println("Please specify home or away team");
        }
    }



}
