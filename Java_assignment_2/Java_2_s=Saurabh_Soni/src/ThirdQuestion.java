public class ThirdQuestion {

    public static void main(String args[]) {
        try
        {
            Class.forName("SaurabhSoni");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("class not found exception will occur:\n  "+ex);
        }
    }
}

/*
NoClassDefFoundError occurs when class was present during compile time and program was compiled and linked successfully but class was not present during runtime.
It is error which is derived from LinkageError.
********************************************************************************
class A
{
    void greeting()
    {
        System.out.println("hello!");
    }
}

class B {
    public static void main(String args[])
    {
        A obj = new A();
        obj.greeting();
    }
}

Above program will be successfully compiled and generate two classes A.class and B.class .
Now remove A.class file and run B.class.
At Java runtime NoClassDefFoundError will be thrown.
* */