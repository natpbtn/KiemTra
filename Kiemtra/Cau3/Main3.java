package Kiemtra.Cau3;

public class Main3 {
    public static void main(String[] args) {
        VanBan vb=new VanBan("Nguyen Anh Tuan");
        System.out.println("So tu trong chuoi van ban la:"+vb.demSoTu());
        System.out.println("Viet hoa chuoi van ban:"+vb.vietHoaToanBo());
        System.out.println("Chuyen hoa thanh thuong:"+vb.hoaThanhThuong());
        System.out.println("Viet hoa dau:"+vb.vietHoaDau());
    }
}

