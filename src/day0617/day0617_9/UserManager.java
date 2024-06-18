package day0617.day0617_9;

public class UserManager {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saveDb() {
        System.out.println("DB에 저장");
    }
}
