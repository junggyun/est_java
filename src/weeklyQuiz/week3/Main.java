package weeklyQuiz.week3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookManager<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        Scanner sc = new Scanner(System.in);

        int mode = 0;
        int function;

        while (mode != 3) {

            // 모드 선택
            if (mode != 1 && mode != 2) { // BookShelf, BookStack 모드 시 뒤로 가기 선택하지 않으면 모드 유지
                System.out.println("=====도서 관리 시스템=====");
                System.out.print("1.BookShelf 이용 / 2.BookStack 이용 / 3. 종료 : ");
                mode = sc.nextInt();
                sc.nextLine();
            }

            // 기능 선택
            switch (mode) {

                // BookShelf 기능
                case 1:
                    System.out.println("=====BookShelf=====");
                    System.out.print("1.도서 추가 / 2.도서 검색(제목) / 3.도서 검색(저자) / 4.도서 삭제 / 0.뒤로 가기 : ");
                    function = sc.nextInt();
                    sc.nextLine();

                    switch (function) {
                        case 1: // 도서 추가
                            try {
                                addBookForShelf(sc, bookShelf);
                            }
                            catch (IdentifierDuplicateException e) { // 이미 존재하는 식별자를 입력할 경우 예외 처리
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2: // 도서 검색(제목)
                            searchByTitle(sc, bookShelf);
                            break;
                        case 3: // 도서 검색(저자)
                            searchByAuthor(sc, bookShelf);
                            break;
                        case 4: // 도서 삭제
                            try {
                                removeByIdentifier(sc, bookShelf);
                            } catch (BookNotFoundException e) { // 해당 도서가 없을 시 예외 처리
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 0:
                            mode = 0;
                            break;
                    }
                    break;

                // BookStack 기능
                case 2:
                    System.out.println("=====BookStack=====");
                    System.out.print("1.도서 추가 / 2.도서 맨 위 검색 / 3.도서 맨 위 제거 / 4.도서 존재 여부 / 0.뒤로 가기 : ");
                    function = sc.nextInt();
                    sc.nextLine();

                    switch (function) {
                        case 1: // 도서 추가
                            try {
                                addBookForStack(sc, bookStack);
                            } catch (InputMismatchException e) {
                                System.out.println("식별자는 숫자만 입력가능합니다.");
                            } catch (IdentifierDuplicateException e) { // 이미 존재하는 식별자를 입력할 경우 예외 처리
                                System.out.println(e.getMessage());
                            } finally {
                                sc.nextLine(); // InputMismatchException 방지
                            }
                            break;
                        case 2: // 도서 맨 위 검색
                            try {
                                System.out.println(bookStack.peekBook().toString());
                            } catch (EmptyStackException e) {
                                System.out.println("책이 존재하지 않습니다.");
                            }
                            break;
                        case 3: // 도서 맨 위 제거
                            try {
                                System.out.println(bookStack.popBook().toString());
                            } catch (EmptyStackException e) {
                                System.out.println("책이 존재하지 않습니다.");
                            }
                            break;
                        case 4: // 도서 존재 여부
                            System.out.println(bookStack.isEmpty() ? "비었습니다." : "책이 존재합니다.");
                            break;
                        case 0:
                            mode = 0;
                            break;
                    }
                    break;

                // 종료
                case 3:
                    System.out.println("=====시스템 종료=====");
                    break;
            }
        }
        sc.close();
    }

    private static void removeByIdentifier(Scanner sc, BookManager<String> bookShelf) {
        System.out.println("=====도서삭제=====");
        System.out.print("식별자: ");
        String identifier = sc.nextLine();
        Book<String> book = bookShelf.searchByIdentifier(identifier);

        bookShelf.removeBook(book);
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

    private static void addBookForShelf(Scanner sc, BookManager<String> bookShelf) {
        System.out.println("=====도서추가=====");

        System.out.print("제목: ");
        String title = sc.nextLine().trim();

        System.out.print("저자: ");
        String author = sc.nextLine().trim();

        System.out.print("식별자: ");
        String identifier = sc.nextLine().trim();


        Book<String> bookForShelf = new Book<>(title, author, identifier);

        bookShelf.addBook(bookForShelf);
    }

    private static void addBookForStack(Scanner sc, BookStack<Integer> bookStack) {
        System.out.println("=====도서추가=====");

        System.out.print("제목: ");
        String title = sc.nextLine().trim();

        System.out.print("저자: ");
        String author = sc.nextLine().trim();

        System.out.print("식별자: ");
        int identifier = sc.nextInt();


        Book<Integer> bookForStack = new Book<>(title, author, identifier);

        bookStack.pushBook(bookForStack);
    }
}
