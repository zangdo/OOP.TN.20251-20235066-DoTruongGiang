package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added successfully");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("The disc " + disc1.getTitle() + " has been added successfully");
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc " + disc2.getTitle() + " has been added successfully");
        } else {
            System.out.println("The cart is almost full. Cannot add both discs.");
        }
    }
    public void addDVD(DigitalVideoDisc ... dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc disc : dvdList) {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc " + disc.getTitle() + " has been added successfully");
            }
        } else {
            System.out.println("The cart is almost full. Cannot add all the discs.");
        }
    }
    public void calculateTotalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getPrice();
        }
        System.out.println("Total cost: " + total+"$");
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if(qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc " + disc.getTitle() + " has been removed successfully");
        } else {
            System.out.println("The disc " + disc.getTitle() + " is not in the cart");
        }
    }
    public void print() {
        if(qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        System.out.println("======================== THE CURRENT CART ==========================");
        System.out.println("Total Items:" + qtyOrdered);
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("-" + itemsOrdered[i].toString());
            total += itemsOrdered[i].getPrice();
        }
        System.out.println("Subtotal: "+total+"$");
        System.out.println("=====================================================================");
    }
}
