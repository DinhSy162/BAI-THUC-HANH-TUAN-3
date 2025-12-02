package quanlyphim;

import java.util.ArrayList;
import java.util.List;

public class PhongChieu {
    private String MaPhong;
    private String LoaiPhong; // 2D, 3D, IMAX
    private int SoLuongGhe;
    private List<Ghe> danhSachGhe; // Mối quan hệ "chứa" 1..* Ghe

    // Constructor
    public PhongChieu(String MaPhong, String LoaiPhong, int SoLuongGhe) {
        this.MaPhong = MaPhong;
        this.LoaiPhong = LoaiPhong;
        this.SoLuongGhe = SoLuongGhe;
        this.danhSachGhe = new ArrayList<>();
        khoiTaoGhe(SoLuongGhe);
    }

    // Giả định: Tự động khởi tạo ghế
    private void khoiTaoGhe(int soLuong) {
        for (int i = 1; i <= soLuong; i++) {
            String loai = (i % 5 == 0) ? "VIP" : "Thường";
            danhSachGhe.add(new Ghe("A" + i, loai));
        }
    }

    @Override
    public String toString() {
        return "Phòng: " + MaPhong + ", Loại: " + LoaiPhong + ", Tổng ghế: " + SoLuongGhe;
    }
}