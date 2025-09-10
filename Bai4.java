package bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so tien gui (VND): ");
        double soTienGui = sc.nextDouble();

        System.out.print("nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("nhap so thang gui : ");
        int soThang = sc.nextInt();

        double tienLai = soTienGui * (laiSuatNam / 100.0 / 12.0) * soThang;
        double tongTien = soTienGui + tienLai;

        System.out.println("\n----- KET QUA -----");
        System.out.println("so tien goc: " + soTienGui + " VND");
        System.out.println("tien lai: " + tienLai + " VND");
        System.out.println("tong so tien cuoi ky: " + tongTien + " VND");
    }
}
