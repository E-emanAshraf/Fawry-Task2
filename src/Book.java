public class Book {
    protected String ISBN;
    protected String title;
    protected int published_year;
    protected float price;

    public Book(String ISBN, String title, int published_year, float price) {
        this.ISBN = ISBN;
        this.title = title;
        this.published_year = published_year;
        this.price = price;
    }

    public Book(String ISBN, String title, int published_year) {
        this.ISBN = ISBN;
        this.title = title;
        this.published_year = published_year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", published_year=" + published_year +
                ", price=" + price +
                '}';
    }
}
