import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        Library library = new Library();
        while(isRunning){
            printInstruction();
            System.out.print("Select the option: ");
            int option = scanner.nextInt();

            if(option == 1){
                System.out.println("Adding a new book:");
                System.out.print("Enter the book name: ");
                String bookname = scanner.nextLine();
                System.out.print("Enter the author name:");
                String author = scanner.nextLine();
                System.out.print("Enter the ISBN:");
                String ISBN = scanner.nextLine();

                addNewBook(bookname,author,ISBN,library);
            }else if(option == 2){
                System.out.println("Adding a new member:");
                System.out.print("Enter the member ID:");
                String memberID = scanner.nextLine();
                System.out.print("Enter the name:");
                String memberName = scanner.nextLine();
                System.out.print("Enter the address:");
                String address = scanner.nextLine();
                System.out.print("Enter the phone number:");
                String phoneNumber = scanner.nextLine();

                addNewMember(memberID, memberName, address, phoneNumber, library);
            }else if(option == 3){
                System.out.println("Lending a book:");
                System.out.print("Enter the member ID:");
                String memberID = scanner.nextLine();
                System.out.print("Enter the ISBN:");
                String ISBN = scanner.nextLine();

                library.issueBook(ISBN, memberID);
            }else if(option == 4){
                System.out.println("Returning a book:");
                System.out.print("Enter the ISBN:");
                String ISBN = scanner.nextLine(); 
                library.returnBook(ISBN);
            } else if(option == 5){
                library.displayAllBooks();
            }else if(option == 6){
                System.out.println("Exiting....");
                isRunning = false;
            }else{
                System.out.println("Wrong option.");
            }
        }
    }

    public static void printInstruction(){
        System.out.println();
        System.out.println("**** Library Management System ****");
        System.out.println("Options:");
        System.out.println("1: Add Book");
        System.out.println("2: Add Member");
        System.out.println("3: Lend a Book");
        System.out.println("4: Return a Book");
        System.out.println("5: Display All Books");
        System.out.println("6: Exit the Program");
        System.out.println("-------------------------------------");
    }

    public static void addNewBook(String name, String author, String ISBN, Library library){
        library.addBook(name, author, ISBN);
    }

    public static void addNewMember(String memberID,String name, String address, String phoneNumber,Library library){
        library.addMember(memberID, name, address, phoneNumber);
    }
}
