package mybloodapp.nestedmango.com.mybloodapp;

/**
 * Created by C2A-PC-8 on 31-03-2018.
 */

public class BloodDonorModelClass {
    private String donorName;
    private  int donorMob;
    private  String donorDob;
    private  int donorTimes;
    private String donorGender;
    private String bloodGroup;

    public BloodDonorModelClass(String donorName, int donorMob, String donorDob, int donorTimes, String donorGender, String bloodGroup) {
        this.donorName = donorName;
        this.donorMob = donorMob;
        this.donorDob = donorDob;
        this.donorTimes = donorTimes;
        this.donorGender = donorGender;
        this.bloodGroup = bloodGroup;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorMob() {
        return donorMob;
    }

    public void setDonorMob(int donorMob) {
        this.donorMob = donorMob;
    }

    public String getDonorDob() {
        return donorDob;
    }

    public void setDonorDob(String donorDob) {
        this.donorDob = donorDob;
    }

    public int getDonorTimes() {
        return donorTimes;
    }

    public void setDonorTimes(int donorTimes) {
        this.donorTimes = donorTimes;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
