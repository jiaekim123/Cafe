package oop.example;

import java.util.Optional;

public class Customer {
    public Optional<Coffee> order(String menuName, Menu menu, Barista barista){
        Optional<MenuItem> menuItem = menu.chooseMenu(menuName);
        if (menuItem.isEmpty()) {
            return Optional.empty();
        }
        return barista.makeCoffee(menuItem.get());
    }
}
