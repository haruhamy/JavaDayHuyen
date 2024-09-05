package lamquenjava3;

import java.util.Scanner;

public class lamquenjava2 {
    // Thuộc tính bán kính
    private double radius;

    // Constructor mặc định với bán kính là 5
    public lamquenjava2() {
        this.radius = 5;
    }

    // Constructor có tham số để khởi tạo bán kính
    public lamquenjava2(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho bán kính
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức toString để in thông tin hình tròn
    @Override
    public String toString() {
        return "Hình tròn với bán kính: " + radius + 
               "\nChu vi: " + getCircumference() + 
               "\nDiện tích: " + getArea();
    }

    // Hàm main để test
    public static void main(String[] args) {
        // Tạo hình tròn c mặc định bán kính 5
        lamquenjava2 c = new lamquenjava2();
        System.out.println(c.toString());

        // Sử dụng Scanner để nhập bán kính
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double inputRadius = scanner.nextDouble();
        
        // Tạo hình tròn với bán kính nhập vào
        lamquenjava2 c2 = new lamquenjava2(inputRadius);
        System.out.println(c2.toString());
        
        // Đóng Scanner
        scanner.close();
    }
}

