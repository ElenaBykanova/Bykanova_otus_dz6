package data;

public enum FieldNameData {

    FNAME("fname"),
    FNAME_LATIN("fname_latin"),
    LNAME("lname"),
    LNAME_LATIN("lname_latin"),
    BLOG_NAME("blog_name"),
    DATEOFBIRTH("date_of_birth"),
    COMPANY("company"),
    JOBTITLE("work");

    private String name;

    FieldNameData(String name){
        this.name = name;
    }

    public String getName(){
       return this.name;
    }


}
