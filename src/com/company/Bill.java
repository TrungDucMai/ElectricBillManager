package com.company;

public class Bill extends Clients {
    float newRate;
    float oldRate;
    float payment;

    public Bill() {
    }

    public Bill(float newRate, float oldRate, float payment) {
        this.newRate = newRate;
        this.oldRate = oldRate;
        this.payment = payment;
    }

    public Bill(String name, String adress, float meterNumber, float newRate, float oldRate) {
        super(name, adress, meterNumber);
        this.newRate = newRate;
        this.oldRate = oldRate;

    }

    public float getNewRate() {
        return newRate;
    }

    public void setNewRate(float newRate) {
        this.newRate = newRate;
    }

    public float getOldRate() {
        return oldRate;
    }

    public void setOldRate(float oldRate) {
        this.oldRate = oldRate;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment( float newRate, float oldRate) {
        this.payment = (newRate-oldRate)*750;
    }

    @Override
    public String toString() {
        return "Bill{" + super.toString() +
                "newRate=" + newRate +
                ", oldRate=" + oldRate +
                ", payment=" + payment +
                '}';
    }
}
