package com.hust.kstn;

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
        System.out.println("=== Total items in the cart=="+ qtyOrdered+" ===");
        System.out.println("All items in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println("[Title] :" + disc.getTitle() + "[Cost] :" + disc.getPrice() + "$");
        }
    }
}
