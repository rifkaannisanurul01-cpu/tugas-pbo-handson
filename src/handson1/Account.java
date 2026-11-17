package handson1;

enum AccountType {
    SAVINGS, CREDIT, DEPOSIT;

    @Override
    public String toString() {
        switch (this) {
            case SAVINGS: return "Akun Tabungan (Savings)";
            case CREDIT: return "Akun Kredit (Credit)";
            case DEPOSIT: return "Akun Deposito (Deposit)";
            default: return super.toString();
        }
    }
}

public class Account {
    private AccountType type;

    public Account(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return type;
    }

    public static void main(String[] args) {
        for (AccountType t : AccountType.values()) {
            System.out.println(t.toString());
        }
    }
}