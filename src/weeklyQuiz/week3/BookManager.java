package weeklyQuiz.week3;

import java.util.List;

public interface BookManager<T> {
    void addBook(Book<T> book);

    void removeBook(Book<T> book);

    List<Book<T>> searchByTitle(String title);

    List<Book<T>> searchByAuthor(String author);

    boolean isNewIdentifier(T t); // 식별자 중복 검사

    Book<T> searchByIdentifier(T t); // 식별자를 통한 Book 객체 검색
}
