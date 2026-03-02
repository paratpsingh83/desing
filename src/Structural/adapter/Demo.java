package Structural.adapter;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Program started...");

        AppleCharger charger = new Adapter(new DkCharger());

        Iphone13 iphone13 = new Iphone13(charger);

        iphone13.chargeIphone();

    }
}
