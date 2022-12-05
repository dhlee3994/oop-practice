package org.example.restaurant;

import java.util.List;

public class Menu {
    private final List<MenuItem> menus;

    public Menu(List<MenuItem> menus) {
        this.menus = menus;
    }

    public MenuItem choose(String foodName) {
        return menus.stream()
                .filter(m -> m.match(foodName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 음식이름입니다."));
    }
}
