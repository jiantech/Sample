package SampleClass;

public class SampleInnerClass {
    private class InnerClassA {
        private int data;
        public void print()
        {
            System.out.println("I am from Inner Class A");
        }

        private void setData()
        {
            data = 0;
        }

        public int getData() {
            printLine();
            return data;
        }
    }

    private class InnerClassB {
        public void display()
        {
            System.out.println("I am from Inner Class B");
        }

        private void display2()
        {
            printLine();
            System.out.println("test");
        }
    }

    public SampleInnerClass()
    {
        InnerClassA innerClassA = new InnerClassA();
        innerClassA.print();
        innerClassA.setData();
        System.out.println(innerClassA.data);
    }

    private void printLine()
    {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        SampleInnerClass sampleInnerClass = new SampleInnerClass();
        SampleInnerClass.InnerClassB innerClassB = sampleInnerClass.new InnerClassB();
        innerClassB.display();
        innerClassB.display2();
    }
}
