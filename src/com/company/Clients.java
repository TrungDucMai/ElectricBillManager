package com.company;

public class Clients {
    private String name;
    private String adress;
    private float meterNumber;

    public Clients() {
    }

    public Clients(String name, String adress, float meterNumber) {
        this.name = name;
        this.adress = adress;
        this.meterNumber = meterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public float getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(float meterNumber) {
        this.meterNumber = meterNumber;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", meterNumber=" + meterNumber +
                '}';
    }
}
