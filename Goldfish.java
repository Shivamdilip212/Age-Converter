//  Goldfish a descendent of Pet
public class Goldfish extends Pet {
    
    // constructor
    //pass 2 parameters someName (String) and someAge (int) to
    //the constructor of the ancestor class
    
    public Goldfish(String someName, int someAge) {
        super(someName,someAge);
    }
    
    // methods
    //  override the method selfDescribe()
    //  return a string like this WITHOUT calling the ancestor's method:
     @Override public String selfDescribe() {
        return "Hello, my name is " + someName + ". I am a goldfish and I am " + someAge + " years old. I swim around and nap all day!";
    }
}
