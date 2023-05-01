package day30_inheritance.planetTask;

import java.util.ArrayList;

public class Earth extends Planet{

    private ArrayList<String> Species;
    private String atmosphere;

    public Earth(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, int population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }



}
