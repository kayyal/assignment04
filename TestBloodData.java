package assignment04;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        printtheBloodType(bloodData);

        BloodData bloodData1 = new BloodData("AB" , "NEAGATIVE");
        printtheBloodType(bloodData1);
        bloodData.setBloodType("A");
        bloodData.setRhFactor("POSITIVE");
        printtheBloodType(bloodData);

    }
    static void printtheBloodType (BloodData bl){
        System.out.println( "bloodType is : " + bl.getBloodType()+
                "rhFactor is : " + bl.getRhFactor());
    }


}
