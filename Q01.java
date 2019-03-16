package assignment04;

import java.util.Scanner;

public class Q01 {
    String message;
    int number;

    public Q01(String message) {
        this.message = message;
    }

    char encrypt(char inputChar, int addedNumber) {
        inputChar = (char) ((int) (inputChar + addedNumber));
        return inputChar;
    }

    String encryptAll(String message, int addedNumber) {
        String encryptrdMessage ;
        char[] stringToChar = message.toCharArray();
        for (int i = 0; i < stringToChar.length; i++) {
            if (stringToChar[i]==' '){
                continue;
            }
            stringToChar[i] = encrypt(stringToChar[i] , addedNumber);
//            String s += String.valueOf(stringToChar[i]);
//            System.out.println();
        }
        encryptrdMessage = String.copyValueOf(stringToChar);
        return encryptrdMessage;
    }

    public String getMessage() {
        return message;
    }

    public void getCode(int code) {
        this.number = code;
    }
}
