package rw.ac.rca;

import java.util.Date;

public class Student {
    private  int code;
    private  String firstName;
    private String district;
    private Date dob;

    public int getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
