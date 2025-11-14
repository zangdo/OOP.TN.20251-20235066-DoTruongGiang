package com.hust.kstn;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95, "Roger Allers", 87); 
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95, "George Lucas", 87);
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.print();
        cart.calculateTotalCost();
        cart.removeDVD(dvd2);
        cart.print();
        cart.calculateTotalCost();
    }
}