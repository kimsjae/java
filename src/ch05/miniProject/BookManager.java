package ch05.miniProject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

class Book {
    String title;
    int score;
    static int count = 0; // 등록된 책의 수를 저장하는 정적 필드

    // 생성자
    public Book(String title, int score) {
        this.title = title;
        this.score = score;
        count++; // 책이 등록될 때마다 count 증가
    }

    // 책 정보를 출력하는 메서드
    public void printBook() throws IOException {
        BookManager.bw.write("제목: " + title + ", 평점: " + score + "\n");
        BookManager.bw.flush();
    }
}

public class BookManager {
    private static ArrayList<Book> bookList = new ArrayList<>(); // 책 목록을 저장하는 ArrayList
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 책 등록 메서드
    public static void addBook() throws IOException {
        bw.write("제목: ");
        bw.flush();
        String title = br.readLine();

        bw.write("평점: ");
        bw.flush();
        int score = Integer.parseInt(br.readLine());

        bookList.add(new Book(title, score)); // 새 책을 ArrayList에 추가
        bw.write("책이 등록되었습니다.\n");
        bw.flush();
    }

    // 책 검색 메서드
    public static void searchBook() throws IOException {
        bw.write("검색할 책 제목을 입력하세요: ");
        bw.flush();
        String title = br.readLine();

        for (Book book : bookList) {
            if (book.title.equals(title)) {
                book.printBook();
                return;
            }
        }
        bw.write("책을 찾을 수 없습니다.\n");
        bw.flush();
    }

    // 모든 책 출력 메서드
    public static void printAllBooks() throws IOException {
        if (bookList.isEmpty()) {
            bw.write("등록된 책이 없습니다.\n");
            bw.flush();
            return;
        }

        for (Book book : bookList) {
            book.printBook();
        }
        bw.write("등록된 책의 수: " + Book.count + "\n");
        bw.flush();
    }

    // 메뉴를 출력하고 사용자 선택을 받는 메서드
    public static void printMenu() throws IOException {
        while (true) {
            bw.write("================\n");
            bw.write("1. 책 등록\n");
            bw.write("2. 책 검색\n");
            bw.write("3. 모든 책 출력\n");
            bw.write("4. 종료\n");
            bw.write("================\n");
            bw.write("번호를 입력하시오: ");
            bw.flush();
            int choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                searchBook();
            } else if (choice == 3) {
                printAllBooks();
            } else if (choice == 4) {
                bw.write("프로그램을 종료합니다.\n");
                bw.flush();
                break; // while 문을 빠져나옴
            } else {
                bw.write("잘못된 입력입니다. 다시 선택하세요.\n");
                bw.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        printMenu(); // 메뉴 실행
        bw.close();
    }
}
