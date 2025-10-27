package com.hatester.bt_java_oop1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Tran Thu Ha", 27, "Nu", "Ha Noi", "0965994307");
        nv1.getInfor();

        System.out.println("===========================================");
        NhanVien nv2 = new NhanVien("Nguyen Minh Anh", 20, "Nam", "HCM", "0698546654");
        nv2.getInfor();
    }
}
