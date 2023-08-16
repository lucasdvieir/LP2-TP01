public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsString = "";
        for (Author author : authors) {
            authorsString += author.toString() + ", ";
        }
        if (authorsString.length() > 0) {
            authorsString = authorsString.substring(0, authorsString.length() - 2); // Remove trailing comma and space
        }

        return "Book[name=" + name + ", authors={" + authorsString + "}, price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorsNames() {
        String authorsNames = "";
        for (Author author : authors) {
            authorsNames += author.getName() + ", ";
        }
        if (authorsNames.length() > 0) {
            authorsNames = authorsNames.substring(0, authorsNames.length() - 2); // Remove trailing comma and space
        }
        return authorsNames;
    }
}
