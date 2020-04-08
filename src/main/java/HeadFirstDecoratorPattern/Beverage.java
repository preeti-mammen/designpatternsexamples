package HeadFirstDecoratorPattern;

public abstract class Beverage {
    String description = "Some Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
