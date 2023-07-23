public class Book{

    private String name;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    Book(){

    }
    
    Book(String name, String author, String ISBN){
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    Book(String name, String author){
        this.name = name;
        this.author = author;
        this.ISBN = null;
        this.isAvailable = true;
    }

    public boolean checkAvailability(){
        return this.isAvailable;
    }

    public void issueBook(){
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;
    }

    public void setname(String name){
        if(name.length() > 0){
            this.name = name;
        }
        
    }

    public String getname(){
        return this.name;
    }

    public String getISBN(){
        return this.ISBN;
    }

    public void displayBookInfo(){
        System.out.println("Book Name: "+this.name);
        System.out.println("Author Name: "+this.author);
        System.out.println("ISBN: "+this.ISBN);
    }

}