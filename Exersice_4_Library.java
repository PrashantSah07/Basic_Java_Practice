class Library {

    public String[] availableBook;
    public String[] books;
    public int totalIssuedBooks;
  
    void addBooks(String... str) {
      availableBook = str;
    }
  
    void showAvailableBooks() {
      System.out.println("The Available books in this library:");
      for (int a = 0; a < availableBook.length; a++) {
        System.out.println(availableBook[a]);
      }
      System.out.println();
    }
  
    void issueBook(String... str1) {
      totalIssuedBooks += str1.length;
      books = str1;
    }
  
    void returnBook() {
      for (String e:books) {
        for (String e1:availableBook) {
          if (e == e1) {
            System.out.println("You have successfully issued books");
            for (String element : books) {
              System.out.println(element);
            }
            System.out.println(); 
            return;
          } else {
            System.out.println("This centain book is not available in this library");
            
          }
        }
      }
    }
  
    void getTIB() {
      System.out.println("The total issued books in this library is: " + totalIssuedBooks);
    }
  }
  
  public class Exersice_4_Library {
  
    public static void main(String[] args) {
      Library lb = new Library();
      lb.addBooks("Physics", "Chemistry", "Mathematics", "Hindi", "English");
      lb.showAvailableBooks();
      lb.issueBook("Hindi");
      lb.returnBook();
      lb.getTIB();
    }
  }
  