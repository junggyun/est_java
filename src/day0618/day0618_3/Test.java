package day0618.day0618_3;

public class Test {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("Smart TV");
        product.setCompany("Samsung");

        Storage<Tv> tvStorage = new StorageImpl<>(100);
        tvStorage.add(new Tv(), 0);
    }
}

