package day0617.day0617_5;

public interface ProfileRepository {
    void save();

    default void delete() {
        System.out.println("삭제");
    }
}
