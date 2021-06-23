package SinhVien;

import Common.IPerson;
import Common.Person;

public class SinhVien extends Person implements IPerson {
    int namNhapHoc;

    public SinhVien(String name, int age, String address, int namNhapHoc) {
        super(name, age, address);
        this.namNhapHoc = namNhapHoc;
    }

    @Override
    public void An() {

    }

    @Override
    public void Ngu() {

    }

    @Override
    public void Tho() {

    }
}
