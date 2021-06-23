package GiangVien;

import Common.IPerson;

public class GiangVienFullTime extends GiangVien implements IGiangVien, IPerson {

    public GiangVienFullTime(String name, int age, String address, String phoneNumber, int id) {
        super(name, age, address, phoneNumber, id);
        QuanLyLopHoc(name);

    }

    @Override
    public void GiangBai() {

    }

    @Override
    public void ChamBai() {

    }

    @Override
    public void An() {
        super.An();
    }

    @Override
    public void Ngu() {
        super.Ngu();
    }

    @Override
    public void Tho() {
        super.Tho();
    }

    private void QuanLyLopHoc(String name){
        System.out.println( name + " là giảng viên full time quản lý lớp học");
    }
}
