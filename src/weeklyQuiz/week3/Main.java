package weeklyQuiz.week3;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookShelf<String> shelf = new BookShelf<>();
        BookStack<Integer> stack = new BookStack<>();

        int mode = 0;
        while (mode != -1) {
            System.out.print("무엇을 도와드릴까요?(1.도서추가 / 2.제목으로 검색 / 3.저자로 검색 / 4.맨 위 도서 꺼내기 / 5.맨 위 도서 확인 / 6.종료");
            mode = sc.nextInt();

            switch (mode) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
            }
        }



        String title ="";
        String author = "";
        int identifier = 0;
        try {
            System.out.print("제목: ");
            title = sc.nextLine();

            System.out.print("저자: ");
            author = sc.nextLine();

            System.out.print("식별자: ");
            identifier = sc.nextInt();

            Book<String> shelfBook = new Book<>(title, author, String.valueOf(identifier));
            Book<Integer> stackBook = new Book<>(title, author, identifier);

            shelf.addBook(shelfBook);
            stack.pushBook(stackBook);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        List<Book<String>> resultByAuthor = shelf.searchByAuthor(author);
        System.out.println(resultByAuthor.toString());

        List<Book<String>> resultByTitle = shelf.searchByTitle(title);
        resultByTitle.forEach(System.out::println);

        try {
            Book<Integer> bookByPop = stack.popBook();
            System.out.println(bookByPop);
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book<Integer> bookByPeek = stack.peekBook();
            System.out.println(bookByPeek);
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        boolean isBookEmpty = stack.isEmpty();
        System.out.println(isBookEmpty);
    }

}
