package lamquenjava4;

public class SinhVien {
    // Các thuộc tính
    private String ten;
    private int tuoi;
    private String maSinhVien;

    // Constructor mặc định
    public SinhVien() {
        this.ten = "Unknown";
        this.tuoi = 0;
        this.maSinhVien = "00000000";
    }

    // Constructor có đối số để khởi tạo các thuộc tính
    public SinhVien(String ten, int tuoi, String maSinhVien) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.maSinhVien = maSinhVien;
    }

    // Phương thức inThongTin() để in thông tin của sinh viên
    public void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Mã Sinh Viên: " + maSinhVien);
    }
}

