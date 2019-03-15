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
        char[] stringToChar = message.toCharArray();
        for (char selectedchar : stringToChar) {
            stringToChar[selectedchar] = encrypt(selectedchar, addedNumber);
        }
        message = stringToChar.toString();
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void getCode(int code) {
        this.number = code;
    }
}
