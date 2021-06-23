package SinhVien;

import Common.Person;

public class SinhVien extends Person {
    int namNhapHoc;

    public SinhVien(String name, int age, String address, int namNhapHoc) {
        super(name, age, address);
        this.namNhapHoc = namNhapHoc;
    }
}
