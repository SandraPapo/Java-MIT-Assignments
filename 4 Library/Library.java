public class Library{
    // Add the missing implementation to this class
    String address;
    Book[] allBooks = {};
    
    public Library(String libAddress) {
        address = libAddress;
    }
    
    public void addBook(Book theBook) {
        Book[] tmp = new Book[allBooks.length + 1];
        for (int i = 0; i < allBooks.length; i++){
            tmp[i] = allBooks[i];
        }
        tmp[allBooks.length] = theBook;
        allBooks = tmp;
    }
    
    public static void printOpeningHours() {
        System.out.println( "9am to  5pm" );
    }
    
    public void printAddress() {
        System.out.println(address);
    }
    
    public void printAvailableBooks(){
        boolean empty = true;
        for(int i = 0; i < allBooks.length; i++){
            if (!(allBooks[i].isBorrowed())){
                System.out.println(allBooks[i].getTitle());
                empty = false;
            }
        }
        if (empty){
            System.out.println("No books in catalog");
        }
    }
    
    public void borrowBook(String title) {
        boolean in_collection = false;
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i].getTitle() == title){
                if (allBooks[i].isBorrowed()){
                    System.out.println("This book is already borrowed.");
                    in_collection = true;
                } else {
                    allBooks[i].borrowed();
                    System.out.println("You have successfully borrowed " + title);
                    in_collection = true;
                }
                    
            }
        }
        if (!(in_collection)){
            System.out.println("Sorry that book is not available");
        }
    }
        
    public void returnBook(String title) {
        boolean in_collection = false;
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i].getTitle() == title){
                if (allBooks[i].isBorrowed()){
                    System.out.println("You have sucessfully returned " + title);
                    allBooks[i].returned();
                    in_collection = true;
                }
                    
            }
        }
        if (!(in_collection)){
            System.out.println("Sorry that book is not available");
        }
    }
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}