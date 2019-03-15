package assignment04;

public class Q01 {
    String message ;
    int number ;



    char encrypt (char inputChar , int addedNumber){
        inputChar =(char)((int)(inputChar + addedNumber));
        return inputChar;
    }
    String encryptAll (String message , int addedNumber){
        char [] stringToChar = message.toCharArray();
        for (char selectedchar:stringToChar) {
            stringToChar[selectedchar] = encrypt(selectedchar, addedNumber);
        }
        message = stringToChar.toString();
        return message;
    }

    public String getMessage() {
        return message;
    }
    public void getCode (int code){
        this.number = code;
    }
}
