package weeklyQuiz.week2;

public class PremiumShoppingMall extends ShoppingMall {

    public PremiumShoppingMall(int size) {
        super(size);
    }

    @Override
    public boolean checkOrderAvailability() {
        int count = 0;
        for (Product product : getProducts()) {
            if (product != null) {
                count += product.getStock();
            }
        }
        return count >= 10;
    }
}
