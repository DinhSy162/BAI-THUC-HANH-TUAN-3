package quanlyphim;

public class PhimTreEm extends Phim {
    private boolean PhuDeTiengAnh;
    private int DoTuoiPhuHop;
    private String NoiDungGiaoDuc;

    // Constructor rỗng
    public PhimTreEm() {
        super();
    }

    // Constructor đầy đủ
    public PhimTreEm(boolean PhuDeTiengAnh, int DoTuoiPhuHop, String NoiDungGiaoDuc, String TenPhim, String TheLoai, int ThoiLuong) {
        super(TenPhim, TheLoai, ThoiLuong);
        this.PhuDeTiengAnh = PhuDeTiengAnh;
        this.DoTuoiPhuHop = DoTuoiPhuHop;
        this.NoiDungGiaoDuc = NoiDungGiaoDuc;
    }

    // Phương thức riêng (theo sơ đồ)
    public String toString() {
        return super.toString();
    }

    // Triển khai phương thức trừu tượng
    @Override
    public String phuongThucHienThiThongTin() {
        return super.toString() +
                " | Loại: Trẻ Em" +
                " | Phụ đề TA: " + (PhuDeTiengAnh ? "Có" : "Không") +
                ", Tuổi: " + DoTuoiPhuHop +
                ", Giáo dục: " + NoiDungGiaoDuc;
    }
}