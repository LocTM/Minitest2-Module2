public class FictionBook extends Book {
    public String Category;
    public FictionBook(){

    }

    public FictionBook(String category) {
        Category = category;
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
