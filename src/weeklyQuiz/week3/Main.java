package weeklyQuiz.week3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookManager<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        Scanner sc = new Scanner(System.in);

        int mode = 0;
        while (mode != 9) {
            System.out.print("1.도서추가 / 2.도서검색(제목) / 3.도서검색(저자) / 4.도서꺼내기 / 5.도서확인 / 6.도서 존재 여부 / 7.도서삭제(제목) / 8.도서삭제(저자) / 9.종료 : ");
            mode = sc.nextInt();
            sc.nextLine();

            switch (mode) {
                case 1: // 도서추가
                    try {
                        addBook(sc, bookShelf, bookStack);
                    } catch (NumberFormatException e) { // 식별자가 숫자 형식이 아닐 경우 예외 처리
                        System.out.println("식별자는 숫자만 입력가능합니다.");
                    } catch (IdentifierDuplicateException e) { // 이미 존재하는 식별자를 입력할 경우 예외 처리
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2: // 도서검색(제목)
                    searchByTitle(sc, bookShelf);
                    break;
                case 3: // 도서검색(저자)
                    searchByAuthor(sc, bookShelf);
                    break;
                case 4: // 도서꺼내기
                    try {
                        System.out.println(bookStack.popBook().toString());
                    } catch (EmptyStackException e) {
                        System.out.println("책이 존재하지 않습니다.");
                    }
                    break;
                case 5: // 도서확인
                    try {
                        System.out.println(bookStack.peekBook().toString());
                    } catch (EmptyStackException e) {
                        System.out.println("책이 존재하지 않습니다.");
                    }
                    break;
                case 6: // 도서 존재 여부
                    System.out.println(bookStack.isEmpty() ? "비었습니다." : "책이 존재합니다.");
                    break;
                case 7: // 도서삭제(제목)
                    removeByTitle(sc, bookShelf);
                    break;
                case 8: // 도서삭제(저자)
                    removeByAuthor(sc, bookShelf);
                    break;
                case 9: // 종료
                    System.out.println("=====시스템 종료=====");
                    break;
            }
        }
        sc.close();
    }

    private static void removeByAuthor(Scanner sc, BookManager<String> bookShelf) {
        System.out.println("=====도서삭제(저자)=====");
        System.out.print("저자: ");
        String author = sc.nextLine();

        bookShelf.searchByAuthor(author).stream().forEach(bookShelf::removeBook);
    }

    private static void removeByTitle(Scanner sc, BookManager<String> bookShelf) {
        System.out.println("=====도서삭제(제목)=====");
        System.out.print("제목: ");
        String title = sc.nextLine();

        bookShelf.searchByTitle(title).stream().forEach(bookShelf::removeBook);
    }

    private static void searchByAuthor(Scanner sc, BookManager<String> bookShelf) {
        System.out.println("=====도서검색(저자)=====");
        System.out.print("저자: ");
        String author = sc.nextLine();

        bookShelf.searchByAuthor(author).stream().forEach(b -> System.out.println(b.toString()));
    }

    private static void searchByTitle(Scanner sc, BookManager<String> bookShelf) {
        System.out.println("=====도서검색(제목)=====");
        System.out.print("제목: ");
        String title = sc.nextLine();

        bookShelf.searchByTitle(title).stream().forEach(b -> System.out.println(b.toString()));
    }

    private static void addBook(Scanner sc, BookManager<String> bookShelf, BookStack<Integer> bookStack) {
        System.out.println("=====도서추가=====");

        System.out.print("제목: ");
        String title = sc.nextLine().trim();

        System.out.print("저자: ");
        String author = sc.nextLine().trim();

        System.out.print("식별자: ");
        String identifier = sc.nextLine().trim();


        Book<Integer> bookForStack = new Book<>(title, author, Integer.parseInt(identifier));
        Book<String> bookForShelf = new Book<>(title, author, identifier);

        bookShelf.addBook(bookForShelf);
        bookStack.pushBook(bookForStack);
    }
}
