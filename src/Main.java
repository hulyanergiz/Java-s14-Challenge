import com.workintech.burger.DeluxeBurger;
import com.workintech.burger.Hamburger;
import com.workintech.burger.HealthyBurger;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Normal", 3.56, "Wrap");

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", "Tofu",5.67, "Sandwich");

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger("Deluxe Burger","double",19.10,"double sandwich");

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();

    }
}