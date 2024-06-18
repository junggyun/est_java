package day0617.day0617_8;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> tBox = new Box<>();
        tBox.set(t);
        return tBox;
    }
}
