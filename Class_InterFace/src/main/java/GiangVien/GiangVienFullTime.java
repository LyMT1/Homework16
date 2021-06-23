package GiangVien;

public class GiangVienFullTime extends GiangVien implements IGiangVien, IGiangVien2 {

    public GiangVienFullTime(String name, int age, String address, String phoneNumber, int id) {
        super(name, age, address, phoneNumber, id);
        QuanLyLopHoc(name);
        DayThem();
    }

    @Override
    public void GiangBai() {

    }

    @Override
    public void ChamBai() {

    }

    @Override
    public void DayThem() {
        System.out.println("Và có dạy thêm ngoài giờ.");
    }

    private void QuanLyLopHoc(String name){
        System.out.println( name + " là giảng viên full time quản lý lớp học.");
    }

}
