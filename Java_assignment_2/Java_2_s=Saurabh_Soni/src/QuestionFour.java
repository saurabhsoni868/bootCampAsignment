//4. WAP to create singleton class.

class Singleton {
    private static Singleton singleInstance = null;
    String testString;

    private Singleton() {
        testString = "I am a singleton class";
    }

    static Singleton getInstance() {
        if (singleInstance == null)
            singleInstance = new Singleton();
        return singleInstance;
    }
}


public class QuestionFour {
    public static void main(String[] args)
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
        if (x == y && y == z)
        {
            // Print statement
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else
        {
            // Print statement
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}