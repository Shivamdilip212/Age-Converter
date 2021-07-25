public class Pet {
   
    protected String someName = "";
    protected int someAge = 0;
    private int ageMultiplier = 1;
    
    // constructor
    public Pet(String someName, int someAge) {
        // assigning the parameters to the properties name and age
        this.someName = someName;
        this.someAge = someAge;
    }

    // adding another constructor that takes an additional parameter
    // someMultiplier (int) and assigning it to the property ageMultiplier
    public Pet(String someName, int someAge, int someMultiplier) {
        // task 1: assign the parameters to the properties name and age
        this.someName = someName;
        this.someAge= someAge;
        ageMultiplier = someMultiplier;
    }

    // methods
    public String selfDescribe() {
        // include the name and age properties in the string
        //  calculate the real age and include it to the string
        return "Hello, my name is " + someName + ". I am " + calculateRealAge() + " in human years.";
    }
    
    //  adding a method calculateRealAge()
    public int calculateRealAge() {
        return someAge * ageMultiplier;
    }
    
}
