package lamquenjava3;

import java.util.Scanner;

public class lamquenjava1 {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhận input từ người dùng
        Scanner scanner = new Scanner(System.in);
        
        // Yêu cầu người dùng nhập giá trị n
        System.out.print("Nhập giá trị của n: ");
        int n = scanner.nextInt();
        
        // Khởi tạo tổng E
        double E = 1.0;
        
        // Tính toán tổng E
        for (int i = 1; i <= n; i++) {
            E += 1.0 / i;
        }
        
        // In kết quả ra màn hình
        System.out.println("Tổng E = " + E);
        
        // Đóng Scanner
        scanner.close();
    }
}
