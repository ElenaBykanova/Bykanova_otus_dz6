package data.cities;

public enum BelurusCityData implements ICityData{
    MINSK("Минск", CuntriesData.BELARUS);

    private String name;
    private CuntriesData cuntriesData;

    BelurusCityData(String name, CuntriesData cuntriesData){
        this.name = name;
        this.cuntriesData = cuntriesData;
    }

    public String getName() {
        return name;
    }

    public CuntriesData getCuntriesData() {
        return cuntriesData;
    }
}
