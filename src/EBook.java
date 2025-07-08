public class EBook extends Book{
    private String filetype;

    public EBook(String ISBN, String title, int published_year, float price, String filetype) {
        super(ISBN, title, published_year, price);
        this.filetype = filetype;
    }

    public String getFiletype() {
        return filetype;
    }
}
