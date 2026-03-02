package Structural.adapter;

public class Adapter implements AppleCharger {

    private AndroidCharger charger;

    public Adapter(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargerAndroidPhone();
        System.out.println("Your phone is charging with adapter");
    }
}
