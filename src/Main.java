import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Book paperBook = new PaperBook("1002", "C++ basics", 2025, 50.0f, 10);
        Book ebook = new EBook("1003", "OOP", 2019, 30.0f,"pdf");
        Book demoBook = new DemoBook("1004", "MySQL", 2018);

        inventory.add(paperBook);
        inventory.add(ebook);
        inventory.add(demoBook);

        System.out.println("=== Buying Paper Book ===");
        inventory.buy("1002", 2, "emy@gmail.com", "Shoubra Masr");

        System.out.println("\n=== Buying eBook ===");
        inventory.buy("1003", 1, "emy@gmail.com", "Giza");

        System.out.println("\n=== Trying to buy demo book ===");
        inventory.buy("1004", 1, "emy@example.com", "Cairo");

        System.out.println("\n=== Removing outdated books (older than 4 years) ===");
        ArrayList<Book> outdated = inventory.remove_out_dated(4);
        for (Book b : outdated) {
            System.out.println("Removed outdated book: " + b.title);
        }

        System.out.println("\n=== Removing a book manually ===");
        inventory.remove(paperBook);
    }
}
