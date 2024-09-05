package lamquenjava4;

public class LamQuenJava4 {
    public static void main(String[] args) {
        // Tạo đối tượng SinhVien với constructor mặc định
        SinhVien sv1 = new SinhVien();
        sv1.inThongTin();

        // Tạo đối tượng SinhVien với constructor có đối số
        SinhVien sv2 = new SinhVien("Nguyen Van A", 20, "SV12345678");
        sv2.inThongTin();
    }
}
