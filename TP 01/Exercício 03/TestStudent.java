public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Djonga", "Rua dos Guararapes", "Análise e Desenvolvimento de Sistemas", 2022, 1500.0);
        Student student2 = new Student("Emicida", "Rua dos Lava Pés", "Data Science", 2021, 1800.0);

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Year: " + student1.getYear());
        System.out.println("Fee: R$" + student1.getFee());
        System.out.println(student1);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Program: " + student2.getProgram());
        System.out.println("Year: " + student2.getYear());
        System.out.println("Fee: R$" + student2.getFee());
        System.out.println(student2);
    }
}


