package weeklyQuiz.week2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product{
    private LocalDate expirationDate;

    public Food(Long id, String name, int price, int stock, LocalDate expirationDate) {
        super(id, name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public int calculatePrice() {
        return ChronoUnit.DAYS.between(LocalDate.now(), expirationDate) <= 7 ? (int) (getPrice() * 0.8) : getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", 유통기한: " + expirationDate;
    }
}
