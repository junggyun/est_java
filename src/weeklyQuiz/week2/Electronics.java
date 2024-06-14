package weeklyQuiz.week2;

public class Electronics extends Product {
    private String brand;

    public Electronics(Long id, String name, int price, int stock, String brand) {
        super(id, name, price, stock);
        this.brand = brand;
    }

    @Override
    public int calculatePrice() {
        return brand.equals("Apple") ? (int) (getPrice() * 1.2) : getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", 브랜드: " + brand;
    }
}
