package lamquenjava4;

public class TaiKhoan {
    // Các thuộc tính
    private String soTaiKhoan;
    private double soDu;

    // Constructor không có đối số
    public TaiKhoan() {
        this.soTaiKhoan = "00000000";
        this.soDu = 0.0;
    }

    // Constructor có đối số để khởi tạo các thuộc tính
    public TaiKhoan(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    // Phương thức nạp tiền vào tài khoản
    public void napTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Nạp " + soTien + " vào tài khoản thành công.");
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }

    // Phương thức rút tiền khỏi tài khoản
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= this.soDu) {
            this.soDu -= soTien;
            System.out.println("Rút " + soTien + " từ tài khoản thành công.");
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    // Phương thức in thông tin tài khoản
    public void inThongTinTaiKhoan() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}
