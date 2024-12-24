package Day10;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    //책들을 관리하는 양반
    HashSet<Book> books = new HashSet<>();
    public List<Book> bookList;



    //책을 추가
    public void addBook(Book book) {
        books.add(book);
    }

    //책을 삭제
    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    //책 정보를 보여줌
    public void showBook(Book book) {
        System.out.println(book);
    }

    //책을 조회
    public void findBook(){
        System.out.println("어느 조건으로 책을 검색하시겠습니까? ");
        System.out.println("1: 책 제목으로 입력");
        System.out.println("2: 지은이로 입력");
        System.out.println("3: 출판년도로 입력");
        while(true){
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch(num){
                case 1:
                    System.out.print("책 제목 입력: ");
                    String findTitle = scanner.nextLine();
                    for (Book findBook : bookList) {
                        if(findBook != null && findBook.getTitle().equals(findTitle)){
                            System.out.println(findBook);
                            break;
                        }
                    }

                case 2:
                    System.out.print("지은이 입력: ");
                    String findAuthor = scanner.nextLine();
                    for (Book findBook : bookList) {
                        if(findBook != null && findBook.getAuthor().equals(findAuthor)){
                            System.out.println(findBook);
                            break;
                        }
                    }

                case 3:
                    System.out.print("책 출판년도 입력: ");
                    int findYear = scanner.nextInt();
                    for (Book findBook : bookList) {
                        if(findBook != null && findBook.getYear() == (findYear)){
                            System.out.println(findBook);
                            break;
                        }
                    }
            }

        }
    }

    public static void main(String[] args) {
//        Book book1 =
//                new Book("dgkim","title",2024);
//
//        Book found1 = null;
//        {
//            for (Book book : bookList) {
//                if (book.getTitle() == "dgkim") {
//                    found1 = book;
//                    break;
//                }
//            }
//        }
    }



}
