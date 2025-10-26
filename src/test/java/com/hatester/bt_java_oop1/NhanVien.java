package com.hatester.bt_java_oop1;

public class NhanVien {
    String hoTen;
    int tuoi;
    String gioiTinh;
    String diaChi;
    String soDienThoai;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String soDienThoai) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public void getInfor() {
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("So dien thoai: " + soDienThoai);
    }
}
