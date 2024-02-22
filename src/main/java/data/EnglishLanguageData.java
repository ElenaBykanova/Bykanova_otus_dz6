package data;

public enum EnglishLanguageData {
    BEGINNER("Начальный уровень (Beginner)"),
    ELEMENTARY("Элементарный уровень (Elementary)"),
    PREINTERMEDIATE("Ниже среднего (Pre-Intermediate)"),
    INTERMEDIATE("Средний (Intermediate)"),
    UPPERINTERMEDIATE("Выше среднего (Upper Intermediate)"),
    ADVANCED("Продвинутый (Advanced)"),
    MASTERY("Супер продвинутый (Mastery)")    ;

    private String name;

    EnglishLanguageData(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
