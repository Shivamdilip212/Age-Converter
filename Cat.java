//inherited from the Pet class
public class Cat extends Pet {
    
    public Cat(String someName, int someAge) {
        
        // calling constructor of ancestor class Pet
        // adding multiplier 8 to constructor call
        super(someName,someAge,8);
    }
    
    // methods
    //  Override selfDescribe() from ancester class.
    //  Call ancester's selfDescribe() 
    @Override public String selfDescribe() {
        return "Fun cat ready to party! " + super.selfDescribe();
    }
    
}