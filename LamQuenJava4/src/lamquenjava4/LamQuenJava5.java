package lamquenjava4;

public class LamQuenJava5 {
    public static void main(String[] args) {
        // Tạo đối tượng TaiKhoan với constructor không có đối số
        TaiKhoan tk1 = new TaiKhoan();
        tk1.inThongTinTaiKhoan();

        // Tạo đối tượng TaiKhoan với constructor có đối số
        TaiKhoan tk2 = new TaiKhoan("12345678", 1000.0);
        tk2.inThongTinTaiKhoan();

        // Nạp tiền vào tài khoản
        tk2.napTien(500.0);
        tk2.inThongTinTaiKhoan();

        // Rút tiền từ tài khoản
        tk2.rutTien(200.0);
        tk2.inThongTinTaiKhoan();
    }
}
