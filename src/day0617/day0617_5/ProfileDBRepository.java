package day0617.day0617_5;

public class ProfileDBRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("DB에 프로필 저장");
    }
}
