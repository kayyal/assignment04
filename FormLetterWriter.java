package assignment04;

public class FormLetterWriter {
    void displaySalutation(String lastName){
        System.out.println("Dear Mr " + lastName);
    }
    void displaySalutation (String firstName , String lastName){
        System.out.println("greeting Dear " + firstName + " " + lastName);
    }
}
