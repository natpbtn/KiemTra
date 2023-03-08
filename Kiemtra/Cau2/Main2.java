package Kiemtra.Cau2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        NhanVien kt1 = new KyThuat("kt1","Nguyen Anh Tuan", "22/02/1997","Thai Nguyen", "DTVT");
        System.out.println(kt1);
        System.out.println(kt1.moTaCongViec());

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();

        NhanVien kt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.println(kt2);
        System.out.println(kt2.moTaCongViec());

    }
}
