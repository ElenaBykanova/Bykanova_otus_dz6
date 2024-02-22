package data.cities;

public enum RussiaCityData implements ICityData{

    MOSCOW("Москва", CuntriesData.RUSSIA);

    private String name;
    private CuntriesData cuntriesData;

    RussiaCityData(String name, CuntriesData cuntriesData){
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
