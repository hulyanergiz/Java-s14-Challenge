package com.workintech.burger;

public class Hamburger implements Additions {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        addition1Name=name;
        addition1Price=price;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        addition2Name=name;
        addition2Price=price;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        addition3Name=name;
        addition3Price=price;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        addition4Name=name;
        addition4Price=price;
    }

    public void itemizeHamburger(){
        double totalPrice=getPrice()+addition1Price+addition2Price+addition3Price;
        String burgerDetails="Burger details:"+
                "Burger name: "+getName()+", "+
                "Meat type: "+getMeat()+", "+
                "Bread Roll Type: "+getBreadRollType()+", "+
                "Price: "+getPrice()+"$"+", "+
                "Additions: "+((addition1Name!=null)?("addition name: "+addition1Name+", addition price: "+addition1Price+"$, "):" ")+
                ((addition2Name!=null)?("addition name: "+addition2Name+", addition price: "+addition2Price+"$, "):" ")+((addition3Name!=null)?("addition name: "+addition3Name+", addition price: "+addition3Price+"$, "):"")+((addition4Name!=null)?("addition name: "+addition4Name+", addition price: "+addition4Price+"$, "):" ")+
                "Total Price: "+totalPrice+"$";
        System.out.println(burgerDetails);

    }
}
