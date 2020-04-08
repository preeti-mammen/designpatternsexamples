package HeadFirstStrategyPattern;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    public Duck setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
        return this;
    }

    public Duck setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
        return this;
    }

    public void duckFly(){
        flyingBehaviour.fly();
    }

    public void duckQuack(){
        quackingBehaviour.quack();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks whether living, rubber or wooden can swim in water no matter what !!!");
    }
}
