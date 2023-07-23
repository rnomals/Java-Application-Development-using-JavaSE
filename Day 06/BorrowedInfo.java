import java.time.LocalDate;

public class BorrowedInfo {
    
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnedDate;
    private boolean status;

    BorrowedInfo(Book book,Member member){
        this.book = book;
        this.member = member;

        //Getting current date and assign it to the issueDate
        this.issueDate = LocalDate.now();

        //Making the status active
        status = true;

        //Making the book unavailable
        book.issueBook();

    }

    public Book getBookInfo(){
        return this.book;
    }
    

    public void returnBook(){
        this.returnedDate = LocalDate.now();
        status = false;

        //making the book available
        book.returnBook();
    }
}
