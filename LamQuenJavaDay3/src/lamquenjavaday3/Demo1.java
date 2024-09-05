package lamquenjavaday3;

public class Demo1 {
    public static void main(String[] args) {
        // Tạo vài tài khoản ngân hàng
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Hiển thị số lượng tài khoản đã tạo
        BankAccount.displayNumberOfAccounts();
        
        // Hiển thị số dư tối thiểu của tài khoản
        System.out.println("Số dư tối thiểu cho một tài khoản là: " + BankAccount.MIN_BALANCE);
    }
}
