package assignment04;

public class FormLetterWriter {
    public static void main(String[] args) {
            FormLetterWriter flw = new FormLetterWriter();
            flw.displaySalutation("Amir");
            flw.displaySalutation("Ali" , "Alavi");
    }
    void displaySalutation(String lastName) {
        System.out.println("Dear Mr " + lastName +
                "\n Thank you so much for taking the time to meet with me" +
                " to discuss selling my handmade sweaters" +
                " in your wonderful shop.");
    }

    void displaySalutation(String firstName, String lastName) {
        System.out.println("greeting Dear " + firstName + " " + lastName +
                "\n Thank you so much for taking the time to meet with me" +
                " to discuss selling my handmade sweaters" +
                " in your wonderful shop.");
    }

}
