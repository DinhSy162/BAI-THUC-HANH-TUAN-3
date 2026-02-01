package quanlyphim;

public class PhimNguoiLon extends Phim {
    private int GioiHanTuoi;
    private boolean CanhBaoNoiDung;

    // Constructor rỗng
    public PhimNguoiLon() {
        super();
    }

    // Constructor đầy đủ
    public PhimNguoiLon(int GioiHanTuoi, boolean CanhBaoNoiDung, String TenPhim, String TheLoai, int ThoiLuong) {
        super(TenPhim, TheLoai, ThoiLuong);
        this.GioiHanTuoi = GioiHanTuoi;
        this.CanhBaoNoiDung = CanhBaoNoiDung;
    }

    // Phương thức riêng (theo sơ đồ)
    public String toString() {
        return super.toString();
    }

    // Triển khai phương thức trừu tượng
    @Override
    public String phuongThucHienThiThongTin() {
        return super.toString() +
                " | Loại: Người Lớn" +
                " | Giới hạn tuổi: " + GioiHanTuoi +
                ", Cảnh báo: " + (CanhBaoNoiDung ? "Có" : "Không");
    }
}