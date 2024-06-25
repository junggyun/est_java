package weeklyQuiz.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf<T> implements BookManager<T> {
    private List<Book<T>> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book<T> book) {
        if (isNewIdentifier(book.getIdentifier())) { // 식별자 중복 검사
            books.add(book);
        } else {
            throw new IdentifierDuplicateException();
        }
    }

    @Override
    public void removeBook(Book<T> book) {
        books.remove(book);
    }

    @Override
    public List<Book<T>> searchByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase())) // 소문자로 변환하여 대소문자 무시
                .collect(Collectors.toList());
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().toLowerCase().contains(author.toLowerCase())) // 소문자로 변환하여 대소문자 무시
                .collect(Collectors.toList());
    }

    public boolean isNewIdentifier(T t) {
        return searchByTitle("").stream().noneMatch(b -> b.getIdentifier().equals(t));
    }
}
