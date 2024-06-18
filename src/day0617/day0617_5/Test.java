package day0617.day0617_5;

public class Test {
    public static void main(String[] args) {
        ProfileService profileService = new ProfileService();
        profileService.saveProfile(new ProfileMemoryRepository());
        profileService.deleteProfile(new ProfileDBRepository());
    }
}
