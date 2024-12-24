package P1223.P3;

import java.util.*;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public Book(String title){
        this.title=title;
    }

    public Book(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

class BookManager implements Comparator<Book> {
    Set<Book> set = new HashSet<>();
    List<Book> bookList = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);

    public void addBook(Book book){
        bookList.add(book);
    }

    public void displayBooks() {
        int displayNumber;
        System.out.println("1. 전체 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 메인 메뉴");
        Scanner sc = new Scanner(System.in);
        displayNumber = sc.nextInt();

        Book result = null;
        boolean flag=true;
        while (flag){
            switch (displayNumber) {
                case 1:
                    System.out.println("전체 선택");
                    for(Book b:bookList){
                        result = b;
//                        System.out.println(result);
                        System.out.println("++++++++++++++++++++++++++++");
                        System.out.println("제목 : "+result.getTitle());
                        System.out.println("저자 : "+result.getAuthor());
                        System.out.println("출판년도 : "+result.getYear());
                        System.out.println("++++++++++++++++++++++++++++");
                    }
                    flag=false;
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("도서명 :");
                    String title = sc.nextLine();

                    for(Book b:bookList){
                        if(b.getTitle().equals(title)) {
                            result = b;
//                            System.out.println(result);
                            System.out.println("++++++++++++++++++++++++++++");
                            System.out.println("제목 : "+result.getTitle());
                            System.out.println("저자 : "+result.getAuthor());
                            System.out.println("출판년도 : "+result.getYear());
                            System.out.println("++++++++++++++++++++++++++++");
                            flag=false;
                            break;
                        }
                    }
                    break;
                case 3:
                    flag=false;
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
    }

    public void sortBooksByYear(){
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        Book result = null;
        for(Book b:bookList){

            result = b;
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("제목 : "+result.getTitle());
            System.out.println("저자 : "+result.getAuthor());
            System.out.println("출판년도 : "+result.getYear());
            System.out.println("++++++++++++++++++++++++++++");
        }
    }

    public void removeBooks(String title){

        Book result = null;
        for(Book b:bookList){
            if(b.getTitle().equals(title)) {
                result = b;
                bookList.remove(result);
                System.out.println(title+" 이(가) 삭제되었습니다.");
                break;
            }
        }
    }

    @Override
    public int compare(Book o1, Book o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BookManager that)) return false;
        return Objects.equals(set, that.set) && Objects.equals(bookList, that.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set, bookList);
    }
}

public class Main {

//    private Map<String, Integer> map = new HashMap<>();

    static final int ADD=1;
    static final int REMOVE=2;
    static final int FIND=3;
    static final int SORT=4;
    static final int EXIT=5;

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이거이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도
//        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도

//        manager.displayBooks();


        while (true) {

            System.out.println("명령을 입력하세요 (1: 추가, 2: 삭제, 3: 검색, 4: 목록 정렬, 5: 종료): ");

            int command = scanner.nextInt(); // 사용자가 명령을 숫자로 입력
            if (command == EXIT) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String title;
            String author;
            int year;
            switch (command) {
                case ADD:
                    scanner.nextLine();
                    System.out.println("도서명: ");
                    title = scanner.nextLine();

                    System.out.println("저자: ");
                    author = scanner.nextLine();

                    System.out.println("출판년도: ");
                    year = scanner.nextInt();

                    Book book = new Book(title, author, year);
                    manager.addBook(book);

                    System.out.println("등록이 완료되었습니다.");
                    scanner.nextLine();

                    break;
                case REMOVE:
                    System.out.println("도서명 :");
                    scanner.nextLine();
                    title = scanner.nextLine();

                    manager.removeBooks(title);
                    break;
                case FIND:
                    manager.displayBooks();
                    break;
                case SORT:
                    manager.sortBooksByYear();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }

        }
        scanner.close();
    }

}
