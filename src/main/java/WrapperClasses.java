public class WrapperClasses {
    public static void main(String[] args) {
        int a = 5;
        String test = "4353456";
        int testNo = Integer.parseInt(test);
        new WrapperClasses().display(Integer.toString(a));

        double d = 34.00;
        new WrapperClasses().display(Double.toString(d));
    }

    public void display(String data)
    {
        System.out.println(data);
    }
}
