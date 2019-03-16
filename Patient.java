package assignment04;

public class Patient {
    BloodData bloodData;
    private int id;
    private int age;
    public Patient(int id, int age, BloodData bloodData) {
        this.id = id;
        this.age = age;
        this.bloodData = bloodData;
    }

    public Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData.setRhFactor("POSITIVE");
        this.bloodData.setBloodType("O");

    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }


}
