package com.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    List inventory = new ArrayList<Book>();

    public Inventory() {
        this.inventory = inventory;
    }

    public void initializeInventory() {
        inventory.add(
                new Book("ISBN001", "How to program in java", "John Doe", "Educational", 29.2, new String[]{
                "first review"}));
        inventory.add(
                new Book("ISBN002", "How to program in cPlusPlus", "John Doe", "Educational", 19.2, new String[]{
                "first review"}));
        inventory.add(
                new Book("ISBN002", "How to program in cPlusPlus", "John Doe", "Educational", 19.2, new String[]{
                "first review"}));
    }

    public double totalAmount() {
        double totalInventoryAmount = 0.0;
        Iterator iterator = inventory.iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            totalInventoryAmount = totalInventoryAmount + book.getPrice();
        }
        return totalInventoryAmount;
    }
}
