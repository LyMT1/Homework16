package Common;

public class Person {
    protected String name;
    public int age;
    public String address;

    public Person(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
        System.out.println("Tên giảng viên : " + getName());
        System.out.println("Tuổi : " + getAge());
        System.out.println("Địa chỉ : " + getAddress());

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

}
