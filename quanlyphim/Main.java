package quanlyphim;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // 1. Khởi tạo Phim
        PhimTreEm phimTreEm = new PhimTreEm(true, 8, "Văn hóa", "Coco", "Hoạt hình", 105);
        PhimNguoiLon phimNguoiLon = new PhimNguoiLon(18, true, "Parasite", "Tâm lý", 132);

        // 2. Khởi tạo Phòng Chiếu
        PhongChieu phong1 = new PhongChieu("P01", "3D", 50);

        // 3. Khởi tạo Suất Chiếu (kết nối Phim và Phòng)
        LocalDateTime thoiGianChieu1 = LocalDateTime.of(2025, 12, 5, 18, 30);
        SuatChieu suatChieu1 = new SuatChieu(thoiGianChieu1, phimTreEm, phong1);

        LocalDateTime thoiGianChieu2 = LocalDateTime.of(2025, 12, 5, 21, 0);
        SuatChieu suatChieu2 = new SuatChieu(thoiGianChieu2, phimNguoiLon, phong1);

        // 4. Quản lý: Thêm suất chiếu vào danh sách quản lý chung của SuatChieu1
        suatChieu1.themSuatChieu(suatChieu1);
        suatChieu1.themSuatChieu(suatChieu2);

        // 5. Hiển thị kết quả
        System.out.println("=== KIỂM TRA HỆ THỐNG QUẢN LÝ RẠP ===");
        System.out.println(suatChieu1.toString());
        System.out.println("---");
        System.out.println(suatChieu2.toString());

        // 6. Kiểm tra chức năng file
        suatChieu1.WriteData();
    }
}