package com.company;

import java.util.ArrayList;
import java.util.List;

public class BillManager {
    List<Clients> billManager = new ArrayList<>();

    public BillManager() {
    }

    public BillManager(List<Clients> billManager) {
        this.billManager = billManager;
    }

    public List<Clients> getBillManager() {
        return billManager;
    }

    public void setBillManager(List<Clients> billManager) {
        this.billManager = billManager;
    }

    public void newClient(String name, String adress, float meterNumber, float newRate, float oldRate) {
        Clients newClient = new Bill(name, adress, meterNumber, newRate, oldRate);
        billManager.add(newClient);
    }


    public void showAll() {
        for (int i = 0; i < billManager.size(); i++) {
            System.out.println("Client : " + billManager.get(i));
        }
    }

    public void flee() {
        for (int i = 0; i < billManager.size(); i++) {
            float flee = (((Bill) billManager.get(i)).getNewRate() - (((Bill) billManager.get(i)).getOldRate())) * 750;

            System.out.println("Flee " + billManager.get(i).getName() + " : " + flee);
        }
    }
}