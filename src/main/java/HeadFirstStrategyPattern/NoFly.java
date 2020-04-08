package HeadFirstStrategyPattern;

public class NoFly implements FlyingBehaviour {
    public void fly() {
        System.out.println("Sorry !!! Cannot Fly");
    }
}
