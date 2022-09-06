package design_patterns.singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    //Bước 2: Xây dựng phương thức khởi tạo cho lớp BookSingleton
    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    //Bước 3: Xây dựng phương thức thực hiện mượn sách
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    //Bước 4: Xây dựng phương thức thực hiện trả sách
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }
    //Bước 5: Một số phương thức get để lấy thông tin về sách
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
