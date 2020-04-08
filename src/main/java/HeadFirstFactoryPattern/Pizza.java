package HeadFirstFactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    ArrayList toppings = new ArrayList();

    abstract void prepare();


    void bake(){
        System.out.println("Baking the pizza for 25 minutes at 350....");
    }

    void cut(){
        System.out.println("Cutting the Pizza in diagonal slices....");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore Box");
    }

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name= name;
    }

    public String toString(){
        return "TEST";
    }
}
