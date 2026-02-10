// Java program showing the working of abstraction Importing generic libraries
import java.io.*;

// Creating an abstract class
// demonstrate abstraction
abstract class Creature {

    abstract void No_Of_legs();
}
class Elephant extends Creature {

    void No_Of_legs()
    {

        System.out.println("It has four legs");
    }
}

class Human extends Creature {

    public void No_Of_legs()
    {

        System.out.println("It has two legs");
    }
}

public class Abstraction_03 {

    public static void main(String[] args)
    {

        Human ob = new Human();

        ob.No_Of_legs();

        Elephant ob1 = new Elephant();

        ob1.No_Of_legs();
    }
}