package lamquenjava;

import java.util.Scanner;

public class LamQuenJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các cạnh của tam giác
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện tam giác
        if (isValidTriangle(a, b, c)) {
            System.out.println("Ba cạnh này có thể tạo thành một tam giác.");
        } else {
            System.out.println("Ba cạnh này không thể tạo thành một tam giác.");
        }
    }

    // Hàm kiểm tra tam giác hợp lệ
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);

    }
}
