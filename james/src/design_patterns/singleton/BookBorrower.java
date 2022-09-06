package design_patterns.singleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    //Tạo phương thức mượn sách borrowBook()
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();

        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    //Xây dựng phương thức lấy về thông tin sách mượn
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }
    //Xây dựng phương thức trả sách
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
