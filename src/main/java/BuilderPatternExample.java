public class BuilderPatternExample {
    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private String state;
    private String postcode;

    public BuilderPatternExample(){
        System.out.println("Constructor Created");
    }


    public BuilderPatternExample setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public BuilderPatternExample setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public BuilderPatternExample setStreet(String street) {
        this.street = street;
        return this;
    }

    public BuilderPatternExample setCity(String city) {
        this.city = city;
        return this;
    }

    public BuilderPatternExample setState(String state) {
        this.state = state;
        return this;
    }

    public BuilderPatternExample setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
}
