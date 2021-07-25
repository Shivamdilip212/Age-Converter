//inherited from the Pet class 
public class Dog extends Pet {
    
    // constructor
    //add someName and someAge to the constructor
    
    public Dog(String someName, int someAge) {
        
        // call constructor of ancestor class Pet
        // add multiplier 7 to constructor call
           super(someName,someAge,7);
    }
    
    // methods  
    // Override selfDescribe() from ancester class.
    // Call ancester's selfDescribe()
     @Override public String selfDescribe() {
        return "Fun dog looking to make friends! " + super.selfDescribe();
    }
}
