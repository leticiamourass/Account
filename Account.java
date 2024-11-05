public class Account {
    private String id;
    private String name;
    private double balance;

    // Construtor com ID, nome e saldo
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Construtor com ID e nome (saldo padrão é 0)
    public Account(String id, String name) {
        this(id, name, 0);
    }

    // Getter para ID
    public String getID() {
        return id;
    }

    // Getter para nome
    public String getName() {
        return name;
    }

    // Getter para saldo
    public double getBalance() {
        return balance;
    }

    // Método para adicionar crédito ao saldo
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Método para debitar do saldo
    public void debit(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Amount exceeded balance");
            }
        }
    }

    // Método para transferir valor para outra conta
    public void transferTo(Account anotherAccount, double amount) {
        if (amount <= balance) {
            this.debit(amount);  // Debita da conta atual
            anotherAccount.credit(amount);  // Credita na outra conta
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Sobrescreve o método toString() para representar a conta de forma legível
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
