package oop.example;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem){
        return new Coffee(menuItem);
    }
}
