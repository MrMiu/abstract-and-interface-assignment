public class Dog extends Pet implements Speakable {
    //Instance variables, every Dog will have an integer represnting the digging speed of it
    private int digSpeed;

    public Dog(String name, Human owner, int digSpeed) {
        /*
        *  Since Dog extends the abstract class Pet, we must call its constructor using super()
        *  This will allow the Dog to use the instance variables found in Pet
        */
        super(name, owner);
        this.digSpeed = digSpeed;
    }

    /* 
    *  These methods are inherited from the Speakable interface, as well as the Pet abstract class. All methods from an interface
    *  are abstract by default, so we have to define its function in this specific class. In addition,
    *  Pet also has an abstract method by the name of makeSound(), which we also must implement.
    *  Note: the use of @Override, siginalling we're defining a method from another class/interface
    */
    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    @Override
    public void sayHi() {
        System.out.println("woof woof hello");
        
    }

    @Override
    public void sayBye() {
        System.out.println("byeeee (woof)");   
    }
}
