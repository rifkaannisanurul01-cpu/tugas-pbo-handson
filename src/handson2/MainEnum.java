package handson2;

enum AccountType {
    SAVINGS("SA", 0.05),
    CREDIT("CR", 0.12),
    DEPOSIT("DP", 0.08);

    private String code;
    private double interestRate;

    private AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() { return code; }
    public double getInterestRate() { return interestRate; }
}

public class MainEnum {
    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            System.out.println("Nama: " + type.name() +
                    ", Kode: " + type.getCode() +
                    ", Suku Bunga: " + (type.getInterestRate() * 100) + "%");
        }
    }
}