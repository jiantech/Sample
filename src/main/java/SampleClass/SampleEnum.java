package SampleClass;

public class SampleEnum {
    public enum Type{
        CHROME("chrome"),
        CHROME_HEADLESS("headless"),
        EDGE("edge"),
        BROWSERSTACK("bs");

        private String test;
        Type(String test) {
            this.test = test;
        }

        public String getValue() {
            return test;
        }
    }

    public SampleEnum(Type type)
    {
        System.out.println(type.ordinal());
        switch (type)
        {
            case CHROME:
                System.out.println("Chrome Browser " + Type.CHROME.getValue());
                break;
            case CHROME_HEADLESS:
                System.out.println("Headless Chrome Browser " + Type.CHROME_HEADLESS.getValue());
                break;
            case EDGE:
                System.out.println("Edge Browser " + Type.EDGE.getValue());
                break;
            case BROWSERSTACK:
                System.out.println("Browserstack " + Type.BROWSERSTACK.getValue());
                break;
        }
    }

    public static void main(String[] args) {
        SampleEnum sampleEnum = new SampleEnum(Type.EDGE);
    }
}
