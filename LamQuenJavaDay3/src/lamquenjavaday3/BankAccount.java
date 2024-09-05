package lamquenjavaday3;

public class BankAccount {
    // Biến hằng MIN_BALANCE để lưu trữ số dư tối thiểu
    public static final double MIN_BALANCE = 50.0;

    // Biến tĩnh để đếm số tài khoản đã được tạo
    private static int numberOfAccounts = 0;

    // Constructor để tạo tài khoản mới
    public BankAccount() {
        // Mỗi lần tạo tài khoản mới, số lượng tài khoản sẽ tăng lên
        numberOfAccounts++;
    }

    // Phương thức tĩnh để hiển thị số lượng tài khoản đã tạo
    public static void displayNumberOfAccounts() {
        System.out.println("Số tài khoản đã tạo: " + numberOfAccounts);
    }
}