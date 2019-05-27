import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        library.add(newBook);
    }

    public void printBooks(){
        for (Book b: library) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b: library) {
            if(StringUtils.included(b.title(), title)){
                found.add(b);
            }
        }

        // iterate the list of books and add all the matching books to the list found

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b: library) {
            if(StringUtils.included(b.publisher(), publisher)){
                found.add(b);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b: library) {
            if(b.year() == year){
                found.add(b);
            }
        }
        return found;
    }
}
