public class Cat extends Pet implements Speakable {
    //Instance variables, every Cat will have an integer represnting the amount of whiskers it has
    private int numWhiskers;

    public Cat(String name, Human owner, int numWhiskers) {
        /*
        *  Since Cat extends the abstract class Pet, we must call its constructor using super()
        *  This will allow the Cat to use the instance variables found in Pet
        */
        super(name, owner);
        this.numWhiskers = numWhiskers;
    }

    /* 
    *  These methods are inherited from the Speakable interface, as well as the Pet abstract class. All methods from an interface
    *  are abstract by default, so we have to define its function in this specific class. In addition,
    *  Pet also has an abstract method by the name of makeSound(), which we also must implement.
    *  Note: the use of @Override, siginalling we're defining a method from another class/interface
    */
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void sayHi() {
        System.out.println("HII MEEOW");
        
    }

    @Override
    public void sayBye() {
        System.out.println("goodbye meow :(");   
    }
}
