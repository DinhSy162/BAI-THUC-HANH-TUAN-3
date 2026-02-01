package quanlyphim;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SuatChieu implements IReadWrite {
    private LocalDateTime ThoiGianChieu;
    private Phim PhimChieu; // Mối quan hệ Composition với Phim
    private PhongChieu PhongChieu; // Mối quan hệ Composition/Aggregation với PhongChieu

    // Thuộc tính quản lý
    private List<SuatChieu> DanhSachQuanLyChung; // Danh sách quản lý các suất chiếu

    // Constructor
    public SuatChieu(LocalDateTime ThoiGianChieu, Phim PhimChieu, PhongChieu PhongChieu) {
        this.ThoiGianChieu = ThoiGianChieu;
        this.PhimChieu = PhimChieu;
        this.PhongChieu = PhongChieu;
        this.DanhSachQuanLyChung = new ArrayList<>();
    }

    // Phương thức thêm suất chiếu vào danh sách quản lý
    public void themSuatChieu(SuatChieu sc) {
        this.DanhSachQuanLyChung.add(sc);
    }

    // Các phương thức phức tạp (placeholder)
    @Override
    public void ReadData() {
        System.out.println("Đang đọc dữ liệu suất chiếu từ file...");
    }

    @Override
    public void WriteData() {
        System.out.println("Đang ghi dữ liệu suất chiếu vào file...");
    }

    @Override
    public String toString() {
        return "SUẤT CHIẾU: " + ThoiGianChieu +
                "\n  - Phim: " + PhimChieu.phuongThucHienThiThongTin() +
                "\n  - Phòng: " + PhongChieu.toString();
    }
}