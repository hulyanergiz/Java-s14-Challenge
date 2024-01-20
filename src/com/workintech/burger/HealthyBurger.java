package com.workintech.burger;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public void addHealthyAddition1(String name,double price){
        healthyExtra1Name=name;
        healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name,double price){
        healthyExtra2Name=name;
        healthyExtra2Price=price;
    }


    @Override
    public void itemizeHamburger() {
        double totalPrice=getPrice()+getAddition1Price()+getAddition2Price()+getAddition3Price()+getAddition4Price()+healthyExtra1Price+healthyExtra2Price;
        String burgerDetails="Burger details:"+
                "Burger name: "+getName()+", "+
                "Meat type: "+getMeat()+", "+
                "Bread Roll Type: "+getBreadRollType()+", "+
                "Price: "+getPrice()+"$"+", "+
                "Additions: "+((getAddition1Name()!=null)?("addition name: "+getAddition1Name()+", addition price: "+getAddition1Price()+"$, "):" ")+
                ((getAddition2Name()!=null)?("addition name: "+getAddition2Name()+", addition price: "+getAddition2Price()+"$, "):" ")+((getAddition3Name()!=null)?("addition name: "+getAddition3Name()+", addition price: "+getAddition3Price()+"$, "):"")+((getAddition4Name()!=null)?("addition name: "+getAddition4Name()+", addition price: "+getAddition4Price()+"$, "):" ")+
                ((healthyExtra1Name!=null)?("addition name: "+healthyExtra1Name+", addition price: "+healthyExtra1Price+"$, "):" ")+((healthyExtra2Name!=null)?("addition name: "+healthyExtra2Name+", addition price: "+healthyExtra2Price+"$, "):" ")+
                "Total Price: "+totalPrice+"$";
        System.out.println(burgerDetails);
    }
}
