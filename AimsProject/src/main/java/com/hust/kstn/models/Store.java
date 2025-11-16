package com.hust.kstn.models;

public class Store {
    public static final int MAX_NUMBERS_ITEMS = 20;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ITEMS];
    public int qtyItems = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyItems < MAX_NUMBERS_ITEMS) {
            itemsInStore[qtyItems] = disc;
            qtyItems++;
            System.out.println("The disc " + disc.getTitle() + " has been added successfully to the store");
        } else {
            System.out.println("The store is almost full");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if(qtyItems == 0) {
            System.out.println("The store is empty");
            return;
        }
        int index = -1;
        for (int i = 0; i < qtyItems; i++) {
            if (itemsInStore[i].getTitle().equals(disc.getTitle())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < qtyItems - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyItems - 1] = null;
            qtyItems--;
            System.out.println("The disc " + disc.getTitle() + " has been removed successfully");
        } else {
            System.out.println("The disc " + disc.getTitle() + " is not in the store");
        }
    }
}
