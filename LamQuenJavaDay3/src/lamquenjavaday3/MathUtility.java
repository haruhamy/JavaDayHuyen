package lamquenjavaday3;

// Lớp Demo để kiểm tra các phương thức
public class MathUtility {

    // Biến tĩnh PI
    public static final double PI = 3.14159;

    // Phương thức tĩnh để tính diện tích hình tròn
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    // Phương thức tĩnh để tính chu vi hình tròn
    public static double calculateCircleCircumference(double radius) {
        return 2 * PI * radius;
    }

    // Phương thức tĩnh để tính diện tích hình chữ nhật
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}