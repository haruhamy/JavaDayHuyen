package lamquenjavaday3;

public class Demo {
    public static void main(String[] args) {
        // Test tính diện tích hình tròn
        double radius = 5.0;
        double circleArea = MathUtility.calculateCircleArea(radius);
        System.out.println("Diện tích hình tròn với bán kính " + radius + " là: " + circleArea);

        // Test tính chu vi hình tròn
        double circleCircumference = MathUtility.calculateCircleCircumference(radius);
        System.out.println("Chu vi hình tròn với bán kính " + radius + " là: " + circleCircumference);

        // Test tính diện tích hình chữ nhật
        double length = 10.0;
        double width = 5.0;
        double rectangleArea = MathUtility.calculateRectangleArea(length, width);
        System.out.println("Diện tích hình chữ nhật với chiều dài " + length + " và chiều rộng " + width + " là: " + rectangleArea);
    }
}
