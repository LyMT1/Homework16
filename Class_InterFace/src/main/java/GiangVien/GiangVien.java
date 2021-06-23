package GiangVien;

import Common.IPerson;
import Common.Person;

public class GiangVien extends Person implements IPerson {
    String phoneNumber;
    int id;

    public GiangVien(String name, int age, String address, String phoneNumber, int id) {
        super(name, age, address);
        setPhoneNumber(phoneNumber);
        setId(id);
        System.out.println("Số điện thoại : " + getPhoneNumber());
        System.out.println("Mã giảng viên : " + getId());
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
