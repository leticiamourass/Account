public class TestMain {
    public static void main(String[] args) {
        // Testa o construtor e toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString()
        Account a2 = new Account("A102", "Kumar"); // saldo padrão
        System.out.println(a2);

        // Testa os getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Testa credit() e debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // erro de débito
        System.out.println(a1);

        // Testa transfer()
        a1.transferTo(a2, 100);  // transferindo para a conta a2
        System.out.println(a1);
        System.out.println(a2);
    }
}
