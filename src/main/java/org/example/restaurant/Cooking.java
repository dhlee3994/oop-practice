package org.example.restaurant;

public class Cooking {
    public Cook cook(MenuItem menuItem) {
        return new Cook(menuItem);
    }
}
