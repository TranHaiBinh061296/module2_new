package practice_activities.bai13_tinhchatoop;

import java.security.cert.Certificate;
import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
    public static long count = 0;
    protected String iD;
    protected String fullName;
    protected String birthday;
    protected long phone;
    protected String email;
    protected List<Certificated> certificates;

    public Employee() {
    }

    public Employee(String iD, String fullName, String birthday, long phone, String email, List<Certificated> certificates) {
        count++;
        this.iD = iD;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificated> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificated> certificates) {
        this.certificates = certificates;
    }

    public long getCount() {
        return count;
    }

    public abstract void showInfo();
}
