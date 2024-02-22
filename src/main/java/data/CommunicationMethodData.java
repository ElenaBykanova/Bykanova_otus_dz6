package data;

public enum CommunicationMethodData {
    VK("VK"),
    OK("OK"),
    SKYPE("Skype"),
    VIBER("Viber"),
    TELEGRAM("Тelegram"),
    WHATSAPP("WhatsApp"),
    HABR("Habr");

    private String name;

    CommunicationMethodData(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
