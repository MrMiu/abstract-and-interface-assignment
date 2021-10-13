public class Main {
    public static void main(String[] args) {

        //Here we create our objects that we want to test
        Human alex = new Human("Alex", 16);
        Dog buddy = new Dog("Buddy", alex, 10);
        Cat duke = new Cat("Duke", alex, 7);

        //And now call upon their methods in order to hear them say Hi and Bye
        alex.sayHi(); alex.sayBye();
        System.out.print("\n");
        buddy.sayHi(); buddy.sayBye();
        System.out.print("\n");
        duke.sayHi(); duke.sayBye();
    }
}
