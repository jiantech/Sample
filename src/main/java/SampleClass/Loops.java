package SampleClass;

public class Loops {
    public static void main(String[] args) {
        String[] array = {"Apple", "Orange", "Lime", "Avocado"};
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("\n\n\n\n");


        //For each
        for(String temp:array)
        {
            System.out.println(temp);
        }


        int limePos = -1;
        for(int i=0; i<array.length; i++)
        {
            if(array[i].equals("Lime"))
            {
                limePos = i;
                break;
            }
        }
        System.out.println(limePos);

        int avocadoPos = -1;
        int counter = 0;
        for(String temp:array)
        {
            if(temp.equals("Avocado"))
            {
                avocadoPos = counter;
                break;// Exits the loop
            }
            counter++;
        }
        System.out.println(avocadoPos);

        for(int i=array.length-1; i>-1; i--)
        {
            System.out.println(array[i]);
        }
        System.out.println("------------------------------");
        //for(int i=array.length-1; i>-1; i=i-2)
        for(int i=array.length-1; i>-1; i-=2)
        {
            System.out.println(array[i]);
        }
        System.out.println("------------------------------");
        for(int i=0; i<array.length; i+=2)
        {
            System.out.println(array[i]);
        }
        System.out.println("------------------------------");
        int c =0;
        do {
            System.out.println(array[c]);
            c++;
        }while(c < array.length);

        System.out.println("------------------------------");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;// Skips the upcoming code clock
            }
            System.out.println(i);
        }
    }
}
