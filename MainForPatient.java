package assignment04;

public class MainForPatient {
    public static void main(String[] args) {
        Patient patient = new Patient();
        printPatient(patient);
        BloodData bloodData  = new BloodData();
        Patient patient1 = new Patient(14314, 23 ,bloodData );
        printPatient(patient1);


    }
   public static void  printPatient(Patient patient){
       System.out.println("default constructor \n " + "id :" + patient.getId()
               + "age : " + patient.getAge() + "bloodType : " + patient.getBloodData());
   }
}
