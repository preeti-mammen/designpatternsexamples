public class BuilderPatternTest {
    public static void main(String args[]) {

        BuilderPatternExample builder1 = new BuilderPatternExample().setFirstname("Preeti").setLastname("Mammen");
        BuilderPatternExample builder2 = new BuilderPatternExample().setStreet("717 Bourke St").setCity("Melbourne").setState("VIC").setPostcode("3000");
    }
}
