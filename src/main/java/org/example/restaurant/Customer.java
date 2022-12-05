package org.example.restaurant;

public class Customer {

    public Cook order(String foodName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(foodName);
        Cook cook = cooking.cook(menuItem);
        return cook;
    }
}
