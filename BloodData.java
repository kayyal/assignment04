package assignment04;

public class BloodData {
    String bloodType;
    String rhFactor;
    public BloodData (){
        this.bloodType = "O";
        this.rhFactor = "Positive";
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
}
