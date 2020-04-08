package HeadFirstStrategyPattern;

public class MuteDuck implements QuackingBehaviour {
    public void quack() {
        System.out.println("I cannot quack at all");
    }
}
