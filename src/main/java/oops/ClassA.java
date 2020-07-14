package oops;

public class ClassA {
    // Member Variable
    private int count;
    private String message;

    // INSTANCE Variable
    public static String PRE_MESSAGE = "Hi Everyone";

    // Constants
    public final String F_MESSAGE = "Hello Everyone";

    //default constructor
    public ClassA()
    {
        count = 0;
        message = "Hello World";
    }

    // Parametrized Constructor
    public ClassA(int count, String message)
    {
        this.count = count;
        this.message = message;
    }

    protected void print()
    {
        String temp = message + "!!!";
        System.out.println(temp);
    }

    public String getMessage() {
        return message;
    }
}
