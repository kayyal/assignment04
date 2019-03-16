package assignment04;

public class Billing {
    public static void main(String[] args) {
        Billing billing = new Billing();
        System.out.println(billing.computeBill(100));
        System.out.println(billing.computeBill(100,10));
        System.out.println(billing.computeBill(100,10,200));
    }
    double computeBill(double price) {
        return price + price * 0.08;
    }

    double computeBill(double price, int quantity) {
        return ((price + price * 0.08) * quantity);
    }
    double computeBill (double price, int quantity , double coupon){
        return  (price  * quantity - coupon)*1.08;
    }

}
