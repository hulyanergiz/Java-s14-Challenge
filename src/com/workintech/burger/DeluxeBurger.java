package com.workintech.burger;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        super.addHamburgerAddition1("cips",0);
        super.addHamburgerAddition2("coke",0);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("no additions are allowed");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("no additions are allowed");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("no additions are allowed");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("no additions are allowed");
    }

    @Override
    public void itemizeHamburger() {
        super.itemizeHamburger();
    }
}
