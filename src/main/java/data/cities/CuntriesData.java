package data.cities;

import org.checkerframework.checker.units.qual.C;

public enum CuntriesData {

    RUSSIA("Россия"),
    BELARUS("Республика Беларусь");

    private String name;

    CuntriesData(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

}
