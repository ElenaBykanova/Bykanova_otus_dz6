package data;

public enum WorkScheduleData {
    FULL("Полный день"),
    FLEXIBLE("Гибкий график"),
    REMOTE("Удаленно");
    private String name;

    WorkScheduleData(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
