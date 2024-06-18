package weeklyQuiz.week2;

public class RuntimeProductNotFoundException extends RuntimeException {
    public RuntimeProductNotFoundException(String name) {
        super("=====상품 삭제=====" + System.lineSeparator() + "\"" + name + "\" 상품이 존재하지 않습니다." + System.lineSeparator());
    }
}
