package quanlyphim;

public class Ghe {
    private String SoGhe;
    private String LoaiGhe; // Thường, VIP

    // Constructor
    public Ghe(String SoGhe, String LoaiGhe) {
        this.SoGhe = SoGhe;
        this.LoaiGhe = LoaiGhe;
    }

    // Phương thức tính tiền (placeholder)
    public double TinhTienGhe() {
        if (LoaiGhe.equalsIgnoreCase("VIP")) {
            return 120000;
        } else {
            return 80000;
        }
    }

    @Override
    public String toString() {
        return "Ghế: " + SoGhe + ", Loại: " + LoaiGhe;
    }
}