package weeklyQuiz.week3;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("존재하지 않는 책입니다.");
    }
}
