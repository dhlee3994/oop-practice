package org.example.restaurant;

import java.util.Objects;

public class MenuItem {
    private final String foodName;
    private final int price;

    public MenuItem(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    public boolean match(String foodName) {
        return this.foodName.equals(foodName);
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return price == menuItem.price && Objects.equals(foodName, menuItem.foodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodName, price);
    }
}
