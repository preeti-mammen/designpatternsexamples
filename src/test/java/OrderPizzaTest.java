import HeadFirstFactoryPattern.ChicagoPizzaStore;
import HeadFirstFactoryPattern.NYPizzaStore;
import HeadFirstFactoryPattern.Pizza;
import HeadFirstFactoryPattern.PizzaStore;

public class OrderPizzaTest {
    public static void main(String args[]){
        PizzaStore nypizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza= nypizzaStore.orderPizza("cheese");
        System.out.println("Ethan Ordered a "+pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel Ordered a "+pizza.getName());
    }
}
