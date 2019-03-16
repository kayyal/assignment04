package assignment04;

public class BloodData {
    String bloodType;
    String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "Positive";
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}
