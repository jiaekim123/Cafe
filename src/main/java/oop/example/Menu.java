package oop.example;

import java.util.List;
import java.util.Optional;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public Optional<MenuItem> chooseMenu(String name){
        return items.stream()
                .filter(menuItem -> menuItem.getName().equals(name))
                .findFirst();
    }
}
