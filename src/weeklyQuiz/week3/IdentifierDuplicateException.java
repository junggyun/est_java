package weeklyQuiz.week3;

public class IdentifierDuplicateException extends RuntimeException {
    public IdentifierDuplicateException() {
        super("이미 존재하는 식별자입니다.");
    }
}
