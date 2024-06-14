package weeklyQuiz.week2;

import java.time.LocalDate;

public class ShoppingMallApplication {
    public static void main(String[] args) {

        PremiumShoppingMall mall = new PremiumShoppingMall(5);

        long idGenerator = 0L;
        mall.addProduct(new Clothing(idGenerator++, "바람막이", 95000, 10, "L"));
        mall.addProduct(new Clothing(idGenerator++, "바람막이", 95000, 5, "M"));
        mall.addProduct(new Electronics(idGenerator++, "에어팟 프로", 330000, 3, "Apple"));
        mall.addProduct(new Electronics(idGenerator++, "갤럭시 버즈", 330000, 5, "Samsung"));
        mall.addProduct(new Food(idGenerator++, "치킨", 19000, 25, LocalDate.of(2024, 6, 20)));
        mall.addProduct(new Food(idGenerator++, "피자", 19000, 150, LocalDate.of(2024, 6, 30)));

        mall.displayProducts();

        try {
            mall.removeProduct(3L);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        mall.addProduct(new Electronics(idGenerator++,"지슈라", 169000, 12, "Logitech"));

        mall.displayProducts();

        try {
            mall.displayProducts(5L);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            mall.displayProducts("바람막이");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        mall.removeProduct();

        mall.displayProducts();

    }
}
