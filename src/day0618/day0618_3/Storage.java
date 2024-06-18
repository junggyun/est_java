package day0618.day0618_3;

public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}
