package day0617.day0617_7;

public class Car<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public boolean isIns() {
        return name instanceof Integer;
    }
}
