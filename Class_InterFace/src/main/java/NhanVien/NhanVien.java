package NhanVien;

import Common.IPerson;
import Common.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien extends Person implements IPerson {
    String phoneNumber;
    int id;
    int timeWorking;

    public NhanVien(String name, int age, String address, String phoneNumber, int id, int timeWorking) {
        super(name, age, address);
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.timeWorking = timeWorking;
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
