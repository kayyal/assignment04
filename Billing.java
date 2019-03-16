package assignment04;

public class Billing {
    double computeBill(double price) {
        return price + price * 0.08;
    }

    double computeBill(double price, int quantity) {
        return ((price + price * 0.08) * quantity);
    }
    double computeBill (double price, int quantity , double coupon){
        return  (price  * quantity - coupon)*0.92;
    }

}
