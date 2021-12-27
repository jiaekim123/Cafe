package oop.example;

public class Customer {
    public void order(String menuName, Menu menu, Barista barista){
        MenuItem menuItem = menu.chooseMenu(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}
