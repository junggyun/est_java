package day0618.day0618_1;

public class Test {
    public static void main(String[] args) {
        System.out.println(compare(2, 1));
        compareString("A", "A");
    }

    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }

    public static <T extends String> void compareString(T t1, T t2) {
        System.out.println(t1.equals(t2) ? "okay" : "no");
    }
}
