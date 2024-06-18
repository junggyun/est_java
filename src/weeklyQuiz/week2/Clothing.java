package weeklyQuiz.week2;

public class Clothing extends Product {
    private String size; // XS, S, M, L, XL

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        // size.contains("L")을 true로 반환하는 경우는 L, XL만 존재 => L이상
        return size.contains("L") ? (int) (getPrice() * 1.1) : getPrice();
    }

    @Override public String toString() {
        return super.toString() + ", 사이즈: " + size;
    }
}
