package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Clients> newClients = new ArrayList<>();
        BillManager trung = new BillManager();
        trung.setBillManager(newClients);


        System.out.println("Nhap so luong khach hang : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < index; i++) {


            System.out.println("Nhap thong tin khach : ");
            System.out.println("Nhap ten : ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhap dia chi : ");
            String address = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhap so cong to dien : ");
            float meterNumber = scanner.nextFloat();
            System.out.println("Nhap chi so moi : ");
            float newRate = scanner.nextFloat();
            System.out.println("Nhap chi so cu : ");
            float oldRate = scanner.nextFloat();

            trung.newClient(name, address, meterNumber, newRate, oldRate);
        }
        trung.showAll();
        trung.flee();
    }
}
