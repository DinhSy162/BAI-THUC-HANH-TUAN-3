package quanlyphim;

public abstract class Phim {
    // Thuộc tính
    protected String TenPhim;
    protected String TheLoai;
    protected int ThoiLuong; // Đơn vị: phút

    // Constructor rỗng
    public Phim() {}

    // Constructor cơ bản
    public Phim(String TenPhim, String TheLoai, int ThoiLuong) {
        this.TenPhim = TenPhim;
        this.TheLoai = TheLoai;
        this.ThoiLuong = ThoiLuong;
    }

    // Phương thức trừu tượng để lấy thông tin chi tiết (thông tin riêng của lớp con)
    public abstract String phuongThucHienThiThongTin();

    @Override
    public String toString() {
        return "Tên: " + TenPhim + ", Thể loại: " + TheLoai + ", Thời lượng: " + ThoiLuong + " phút";
    }
}