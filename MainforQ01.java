package assignment04;

import java.util.Scanner;

public class MainforQ01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mess = scanner.nextLine();
        Q01 obj = new Q01(mess);
        int number = scanner.nextInt();
        System.out.println( obj.encryptAll(mess , number));
    }
}
