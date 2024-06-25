package weeklyQuiz.week3;

public class Book<T> {
    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getIdentifier() {
        return identifier;
    }

    //도서 정보 출력에 사용
    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 식별자: " + identifier;
    }
}
