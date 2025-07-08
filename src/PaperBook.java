public class PaperBook extends Book{
    private int quantity;

    public PaperBook(String ISBN, String title, int published_year, float price, int quantity) {
        super(ISBN, title, published_year, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
