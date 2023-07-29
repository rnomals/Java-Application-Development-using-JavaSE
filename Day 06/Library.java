import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Member> members = new ArrayList<Member>();
    ArrayList<BorrowedInfo> borrowedInfos = new ArrayList<BorrowedInfo>();

    public void addBook(String name, String author, String ISBN){
            Book newBook = new Book(name, author, ISBN);
            books.add(newBook);
            System.out.println("Book added Succesfully!");
    }

    public void addBook(String name, String author){
            Book newBook = new Book(name, author);
            books.add(newBook);
            System.out.println("Book added Succesfully!");
    }

    public void addMember(String memberID,String name, String address, String phoneNumber){
        Member newMember = new Member(memberID, name, address, phoneNumber);
        members.add(newMember);
        System.out.println("Member added Succesfully!");
    }

    public void issueBook(String ISBN, String memberID){
        if(searchBook(ISBN) != -999 && searchMember(memberID) != -999){
            BorrowedInfo newBorrowedInfo = new BorrowedInfo(books.get(searchBook(ISBN)), members.get(searchMember(memberID)));
            borrowedInfos.add(newBorrowedInfo);
            System.out.println("Book Issued Succesfully!");
        }else{
            System.out.println("Incorrect Member or Book Informatio!!");
        }

    }

    public void returnBook(String ISBN){
        if(searchBorrowedBook(ISBN) != -999){
            borrowedInfos.get(searchBorrowedBook(ISBN)).returnBook();
            System.out.println("Book Returned Succefully!");
        }else{
            System.out.println("Error in finding the book!");
        }
    }

    private int searchBook(String ISBN){    

        if(books.size() > 0){
            for(int i = 0; i < books.size(); i++){
                if(books.get(i).getISBN().equals(ISBN)) return i;
            }
        }
        return -999;
    }

    private int searchMember(String memberID){
        if(members.size() > 0){
            for(int i = 0; i < members.size(); i++){
                if(members.get(i).getMemberId().equals(memberID)) return i;
            }
        }
        return -999;
    }

    private int searchBorrowedBook(String ISBN){
        if(borrowedInfos.size() > 0){
            for(int i = 0; i < borrowedInfos.size(); i++){
                if(borrowedInfos.get(i).getBookInfo().getISBN().equals(ISBN)){
                    return i;
                }
            }
        }
        return -999;
    }

    public void displayAllBooks(){
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println();
        }
    }

    public void displayAllMembers(){
        for(Member member: members){
            member.displayMemberInfo();
            System.out.println();
        }
    }
    

}
