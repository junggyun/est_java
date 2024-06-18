package weeklyQuiz.week2;

import java.time.LocalDate;

public class ShoppingMallApplication {
    public static void main(String[] args) {

        PremiumShoppingMall mall = new PremiumShoppingMall(5);

        Product windBreaker = new Clothing("바람막이", 95000, 10, "L");
        Product jacket = new Clothing("자켓", 95000, 5, "M");
        Product airPods = new Electronics("에어팟 프로", 330000, 3, "Apple");
        Product buds = new Electronics("갤럭시 버즈", 330000, 5, "Samsung");
        Product chicken = new Food("치킨", 19000, 25, LocalDate.of(2024, 6, 20));
        Product pizza = new Food("피자", 19000, 150, LocalDate.of(2024, 6, 30));

        mall.addProduct(windBreaker);
        mall.addProduct(jacket);
        mall.addProduct(airPods);
        mall.addProduct(buds);
        mall.addProduct(chicken);
        mall.addProduct(pizza);

        mall.displayProducts();

        Product gSuperLight = new Electronics("지슈라", 169000, 12, "Logitech");
        mall.addProduct(gSuperLight);

        try {
            mall.removeProduct("자켓");
        } catch (RuntimeProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            mall.removeProduct("자켓");
        } catch (RuntimeProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            mall.removeProduct(buds);
        } catch (RuntimeProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        mall.displayProducts();
    }
}
