package practice_activities.bai13_tinhchatoop;

import java.util.List;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;
    private int employee_Type = 0;

    public Experience(String iD, String fullName, String birthday, long phone, String email, List<Certificated> certificates, int expInYear, String proSkill, int employee_Type) {
        super(iD, fullName, birthday, phone, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.employee_Type = employee_Type;
    }
    public Experience() {
    }

    public Experience(int expInYear, String proSkill, int employee_Type) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.employee_Type = employee_Type;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getEmployee_Type() {
        return employee_Type;
    }

    public void setEmployee_Type(int employee_Type) {
        this.employee_Type = employee_Type;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience " +
                ", iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' ;
    }

}
