class Dog implements Cloneable {
    String name;
    String breed;

    // Parameterized constructor
    Dog(String n, String b) {
        this.name = n;
        this.breed = b;
    }

    // Copy constructor
    Dog(Dog otherDog) {
        this.name = otherDog.name;
        this.breed = otherDog.breed;
    }

    // Object cloning
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void getDog() {
        System.out.println(name + " is a " + breed);
    }
}

public class QuestionFive
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Kaaju", "Labrador");
        System.out.println("Original dog:");
        d1.getDog();
        Dog d2 = new Dog(d1);       // copied constructor
        System.out.println("Copied dog:");
        d2.getDog();
        try
        {
            Dog d3 = (Dog) d1.clone();  // with the help of clone method
            System.out.println("Cloned dog:");
            d3.getDog();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }
    }
}