import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.Year;
import java.util.Iterator;

public class Inventory {
    private Map<String,Book>books;
    Service service=new Service();
    public Inventory() {
        books=new HashMap<>();
    }

    public void add(Book b){
        books.put(b.ISBN,b);
    }

    public void remove(Book b) {
        if (books.containsKey(b.ISBN)) {
            System.out.println("Removed: " + b.title);
            books.remove(b.ISBN);
        } else {
            System.out.println("The requested book could not be found in the inventory.");
        }
    }


    public ArrayList<Book> remove_out_dated(int number_of_years_passed){
        int currentYear = Year.now().getValue();
        ArrayList<Book> booksDeleted = new ArrayList<>();

        Iterator<Map.Entry<String, Book>> it = books.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Book> entry = it.next();
            Book book = entry.getValue();
            if (currentYear > book.published_year + number_of_years_passed) {
                booksDeleted.add(book);
                it.remove();
            }
        }
        return booksDeleted;
    }

    public void buy(String isbn,int quantity,String email,String address){
        if(books.get(isbn) instanceof DemoBook){
            System.out.println("This book is a demo copy and is not available for sale.");
            return;
        }
        else{
            if(books.get(isbn) instanceof PaperBook){
                if(((PaperBook) books.get(isbn)).getQuantity()>=quantity){
                    ((PaperBook) books.get(isbn)).setQuantity(((PaperBook) books.get(isbn)).getQuantity()-quantity);
                    System.out.println("paid amount: "+books.get(isbn).getPrice()*quantity);
                    service.send(address,books.get(isbn));
                }
                else{
                    System.out.println("Insufficient quantity available.");
                    return;
                }
            }
            else if(books.get(isbn) instanceof EBook){
                System.out.println("paid amount: "+books.get(isbn).getPrice());
                service.send(email,books.get(isbn));
            }
        }
    }
}
