package com.hust.kstn.test;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;
public class StoreTest {
    public static void main(String[] args) {
        // You can add test cases for Store here if needed
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Science Fiction", 29.99, "Christopher Nolan", 148);
        store.removeDVD(dvd1);
        store.addDVD(dvd1);
        store.removeDVD(dvd1);
        for(int i = 0; i < 20; i++) {
            DigitalVideoDisc tempDvd = new DigitalVideoDisc("DVD " + i, "Category", 10.0, "Director", 120);
            store.addDVD(tempDvd);
        }
        store.addDVD(dvd1);
    }
}
