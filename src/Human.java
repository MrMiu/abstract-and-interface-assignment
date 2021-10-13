public class Human implements Speakable {

    //Instance variables, every Human will have an age, as well as a name
    private String name;
    private int age;
    
    //Constructor. Called whenever a Human object is being initalized
    public Human(String name, int Age) {
        /* 
        *  Define the name and age of a Human using the parameters created in the constructor.
        *  this.VARIABLE_NAME refers to the instance variable of the class. We are saying that 
        *  the parameters defined in the constructor = the instance varaibles defined in the class
        */
        this.name = name;
        this.age = age;
    }

    /* 
    *  These methods are inherited from the Speakable interface. All methods from an interface
    *  are abstract by default, so we have to define its function in this specific class.
    *  Note the use of @Override, siginalling we're defining a method from another class/interface
    */
    @Override
    public void sayHi() {
        System.out.println("Hello!");        
    }

    @Override
    public void sayBye() {
        System.out.println("Goodbye!");
        
    }
}
