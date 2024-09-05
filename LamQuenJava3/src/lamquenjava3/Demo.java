package lamquenjava3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Tạo hình tròn c mặc định bán kính 5
        Circle_1 c = new Circle_1();
        System.out.println(c.toString());

        // Sử dụng Scanner để nhập bán kính
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double inputRadius = scanner.nextDouble();
        
        // Tạo hình tròn với bán kính nhập vào
        Circle_1 c2 = new Circle_1(inputRadius);
        System.out.println(c2.toString());
        
        // Đóng Scanner
        scanner.close();
    }
}

