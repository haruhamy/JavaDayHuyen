package lamquenjavaday3;

// Lớp Student
public class Student {
    // Biến tĩnh để đếm số lượng sinh viên đã được tạo
    private static int studentCount = 0;

    // Thuộc tính của sinh viên
    private String name;
    private int rollNumber;

    // Constructor để tạo sinh viên mới
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        studentCount++; // Mỗi khi tạo một sinh viên mới, tăng số lượng sinh viên
    }

    // Phương thức hiển thị thông tin sinh viên
    public void displayStudentInfo() {
        System.out.println("Tên sinh viên: " + name + ", Mã số sinh viên: " + rollNumber);
    }

    // Phương thức tĩnh để hiển thị số lượng sinh viên đã được tạo
    public static void displayStudentCount() {
        System.out.println("Số lượng sinh viên đã tạo: " + studentCount);
    }
}
