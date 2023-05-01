package day27_accessModifiers;

public class Person {

    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, String lang, int age, char gender){
        this.name = name;
        this.language = lang;
        this.age = age;
        this.gender = gender;
    }

    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads =1;
        numberOfWings =0;
    }

    public static void printPlanetName(){
        System.out.println(planet);
    }

    public void eat(String food){
        System.out.println(name +" is eating "+food+".");
    }

    public void drink(String bev){
        System.out.println(name +" is drinking "+bev+".");
    }

    public String toString(){

        return name+"{Age: "+age+", Gender: "+gender+", Language:" +language+", Planet: "+planet+
                ", isHuman: "+isHuman+", hasNose: "+hasNose+", numberOfWings: "+numberOfWings+
                ", numberOfHeads: "+numberOfHeads+"}";

    }
}
/*
4. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */