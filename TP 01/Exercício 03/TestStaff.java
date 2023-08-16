public class TestStaff {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Carlos da Silva", "Av. Taubaté", "Internato de Madre Tereza", 2500.0);
        Staff staff2 = new Staff("Ana Canvas", "Rua Costa Barros", "Lar dos Moços Puros", 3000.0);

        System.out.println("Staff 1:");
        System.out.println("Name: " + staff1.getName());
        System.out.println("Address: " + staff1.getAddress());
        System.out.println("School: " + staff1.getSchool());
	staff1.setSchool("Escolástica Pink");
        System.out.println("Pay: $" + staff1.getPay());
	staff1.setPay(2800.0);
        System.out.println(staff1);
        

        System.out.println("\nStaff 2:");
        System.out.println("Name: " + staff2.getName());
        System.out.println("Address: " + staff2.getAddress());
        System.out.println("School: " + staff2.getSchool());
	staff2.setSchool("IFSP");
        System.out.println("Pay: $" + staff2.getPay());
	staff2.setPay(3200.0);
        System.out.println(staff2);

    }
}
