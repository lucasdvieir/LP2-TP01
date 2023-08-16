public class TestaAuthor {
    public static void main(String[] args) {
        // Testando o construtor
        Author author1 = new Author("Kleberson Voltair", "klebin@ifsp.edu.br", 'm');
        Author author2 = new Author("Jurema Coralina", "jurema_juhjuh@ifsp.edu.br", 'f');

        // Testando o método toString()
        System.out.println(author1);
        System.out.println(author2);

        // Testando o Setter
        author1.setEmail("VoltaVoltair@ifsp.edu.br");
        author2.setEmail("JuraCoralina@ifsp.edu.br");

        // Testando os Getters
        System.out.println("Name: " + author1.getName());
        System.out.println("Email: " + author1.getEmail());
        System.out.println("Gender: " + author1.getGender());

        System.out.println("Name: " + author2.getName());
        System.out.println("Email: " + author2.getEmail());
        System.out.println("Gender: " + author2.getGender());
    }
}


    