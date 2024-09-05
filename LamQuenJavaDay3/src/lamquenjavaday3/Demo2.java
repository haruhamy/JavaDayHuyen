package lamquenjavaday3;

public class Demo2 {
    public static void main(String[] args) {
        // Tạo một vài sinh viên
        Student student1 = new Student("Nguyễn Văn A", 101);
        Student student2 = new Student("Trần Thị B", 102);
        Student student3 = new Student("Lê Văn C", 103);

        // Hiển thị thông tin của từng sinh viên
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Hiển thị số lượng sinh viên đã tạo
        Student.displayStudentCount();
    }
}
