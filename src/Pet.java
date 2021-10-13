public abstract class Pet {
    // Instance variables of Pet. All classes which extend from Pet will also have these instance variables
    private String name;
    private Human owner;

    //Constructor. Called whenever a Pet object is being initalized
    public Pet(String name, Human owner) {
        /* 
        *  Define the name and owner of a Pet using the parameters created in the constructor.
        *  this.VARIABLE_NAME refers to the instance variable of the class. We are saying that 
        *  the parameters defined in the constructor = the instance varaibles defined in the class
        */
        this.name = name;
        this.owner = owner;
    }

    /*
    *  Abstract method. Different pets make different sounds, so depending on the class that 
    *  inherits from this, they will have a different implementation of makeSound(), which is why
    *  this is defined as an abstract method.
    */
    public abstract void makeSound();

    /*
    *  These methods are normal, regular methods. We explicitly define their function here
    *  as all pets will have the same implementation of these methods.
    */
    public String getName() {
        return name;
    }

    public Human getOwner() {
        return owner;
    }
}
