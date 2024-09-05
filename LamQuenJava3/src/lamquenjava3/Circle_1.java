package lamquenjava3;

public class Circle_1 {
    // Thuộc tính bán kính
    private double radius;

    // Constructor mặc định với bán kính là 5
    public Circle_1() {
        this.radius = 5;
    }

    // Constructor có tham số để khởi tạo bán kính
    public Circle_1(double radius) {
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
}
