public class TestaBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Kleberson Voltair", "klebin@ifsp.edu.br", 'm');
        authors[1] = new Author("Tony Saramago", "toninho@ifsp.edu.br", 'm');

        Book book1 = new Book("Ensaio Sobre a Tolerância", authors, 39.99);
	
	Author[] authors2 = new Author[2];
	authors2[0] = new Author("Jurema Coralina", "jurema_juhjuh@ifsp.edu.br", 'f');
        authors2[1] = new Author("Janete Austin", "janeJ@ifsp.edu.br", 'f');

        Book book2 = new Book("Orgulho e as Cocadas", authors2, 29.99, 100);

        System.out.println("Book 1:");
        System.out.println("Name: " + book1.getName());
        System.out.println("Authors: " + book1.getAuthorsNames());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("Qty: " + book1.getQty());
        System.out.println(book1);

        System.out.println("\nBook 2:");
        System.out.println("Name: " + book2.getName());
        System.out.println("Authors: " + book2.getAuthorsNames());
        System.out.println("Price: $" + book2.getPrice());
        System.out.println("Qty: " + book2.getQty());
        System.out.println(book2);
    }
}

