package ExceptionHandling;

public class ExceptionHandler {
    public static void main(String[] args) {
        String test = null;
        ExceptionHandler eh = new ExceptionHandler();
        //eh.division(3,2);
        //eh.division(3,0);
        //eh.processString(null);
        eh.test(86);
    }

    public int division(int a, int b)
    {
        int temp = 0;
        try {
            temp = a / b;
        }
        catch(ArithmeticException arithmeticException)
        {
            //arithmeticException.printStackTrace();
            // Do nothing

            //System.out.println(arithmeticException.getMessage());
            temp = 10;
            // function call
        }
        System.out.println(temp);
        return temp;
    }

    public void processString(String data)
    {
        try {
            System.out.println(data.replace("a", "A"));
        }
        catch(NullPointerException nullPointerException)
        {
            //nullPointerException.printStackTrace();
            // Do nothing
            //System.out.println(nullPointerException.getMessage());
            // function call
            System.out.println("Default");
        }
    }

    //public void test(int x)throws Exception
    public void test(int x)
    {
        if(x > 0)
        {
            try {
                throw new GreaterException("The value was greater than 0. So cannot be processed.");
            } catch (GreaterException e) {
                e.printStackTrace();
            }catch(Exception exception)
            {
                exception.printStackTrace();
            }
            finally {
                System.out.println("Closed the process.");
            }
        }
    }
}
