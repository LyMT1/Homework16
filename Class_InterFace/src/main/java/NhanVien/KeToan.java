package NhanVien;

public class KeToan extends NhanVien implements INhanVien {
    public KeToan(String name, int age, String address, String phoneNumber, int id, int timeWorking) {
        super(name, age, address, phoneNumber, id, timeWorking);
    }

    @Override
    public void ChamCong() {

    }

    @Override
    public void HoanThanhCongViec() {

    }

    @Override
    public void BaoCao() {

    }

    private void TinhLuong(){

    }
}
