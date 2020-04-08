import HeadFirstStrategyPattern.*;

public class TestDuckUsingStrategyPatten {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        duck.setFlyingBehaviour(new FlyWithWings());
        duck.duckFly();
        duck.setQuackingBehaviour(new Quack());
        duck.duckQuack();

        Duck duck1 = new RubberDuck();
        duck1.setFlyingBehaviour(new NoFly());
        duck1.duckFly();
        duck1.setQuackingBehaviour(new Squeak());
        duck1.duckQuack();

        Duck duck2 = new WoodenDuck();
        duck2.setFlyingBehaviour(new NoFly());
        duck2.duckFly();
        duck2.setQuackingBehaviour(new MuteDuck());
        duck2.duckQuack();
    }
}
