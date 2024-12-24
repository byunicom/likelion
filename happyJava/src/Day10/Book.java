package Day10;

public class Book {
    private String title;
    private String author;
    private int year;

    //필요한 메서드나 생서자는 추가해 주세요.
    public Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

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
}
