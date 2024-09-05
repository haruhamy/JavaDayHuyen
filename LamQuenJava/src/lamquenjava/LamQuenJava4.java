import java.util.Scanner;

public class LamQuenJava4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        
        // Kiểm tra xem n có lớn hơn 0 không
        if (n <= 0) {
            System.out.println("Số nguyên dương n phải lớn hơn 0");
        } else {
            // Tính tổng S
            double S = 0.0;
            for (int i = 1; i <= n; i++) {
                S += 1.0 / (2 * i);
            }
            
            // Xuất kết quả
            System.out.println("Tổng S = " + S);
        }
        
        // Đóng đối tượng scanner
        scanner.close();
    }
}
