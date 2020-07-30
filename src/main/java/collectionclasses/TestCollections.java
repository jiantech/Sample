package collectionclasses;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        new TestCollections().mapExample();
    }

    public void mapExample()
    {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Orange");
        map.put(3, "Grapes");
        map.put(5,"Rambutan");

        System.out.println(map.get(3));

        map.replace(3,"Apple");
        System.out.println(map.get(3));

        System.out.println(map.containsKey(4));

        System.out.println(map.containsValue("Orange"));

        System.out.println(map.keySet());

        System.out.println(map.values().toString());

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry data : entries)
        {
            System.out.println(data.getKey() + " : " + data.getValue());
        }

        Set<Integer> keys = map.keySet();
        for(int key:keys)
        {
            System.out.println(key + " : " + map.get(key));
        }

        map.remove(3);

        System.out.println(map.toString());


        Hashtable<Integer,String> vegs = new Hashtable<>();
        vegs.put(1,"Broccoli");
        vegs.put(2,"Raddish");
        vegs.put(3, "Beets");

        Enumeration<Integer> keys1 = vegs.keys();
        while(keys1.hasMoreElements())
        {
            System.out.println(keys1.nextElement());
        }

        System.out.println(vegs.getOrDefault(3, "Carrot"));
        System.out.println(vegs.getOrDefault(4, "Carrot"));
    }

    public void setExample()
    {
        Set<String> set = new HashSet<>();
        set.add("CD Drive");
        set.add("SMPS");
        set.add("FAN");
        set.add("SMPS");
        set.add("CPU");
        set.add("SMPS");

        System.out.println(set.toString());

        System.out.println(set.contains("FAN"));

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public void linkedListExample()
    {
        LinkedList<String> data = new LinkedList<>();
        data.add("Orange");
        data.add("Apple");
        data.add("Grapes");

        System.out.println(data.toString());

        for(String temp:data)
        {
            System.out.println(temp + " => " + data.indexOf(temp));
        }

        System.out.println(data.getFirst());

        System.out.println(data.toString());

        System.out.println(data.getLast());
        System.out.println(data.toString());

        System.out.println(data.removeFirst());
        System.out.println(data.toString());

        data.addFirst("Lemon");
        data.addLast("Greens");
        System.out.println(data.toString());
    }

    public void listExample()
    {
        String[] data = {"PC", "Laptop", "Workstation"};


        //InterfaceList<DataType> variableName = new ListType<>();
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Orange");
        strList.add("Grapes");
        strList.add(2, "Watermelon");
        System.out.println(strList.isEmpty());
        for(String temp:strList)
        {
            System.out.println(strList.indexOf(temp));
            System.out.println(temp);
        }

        List<String> vegs = new ArrayList<>();
        vegs.add("Cucumber");
        vegs.add("Tomato");

        System.out.println(strList.addAll(vegs));
        strList.addAll(Arrays.asList(data));

        System.out.println(strList.toString());

        System.out.println("has Avocado? " + strList.contains("Avocado"));

        System.out.println("has Vegs? " + strList.contains(vegs));

        System.out.println("Equals List? " + strList.equals(vegs));

        System.out.println("has Vegs? " + strList.containsAll(vegs));

        System.out.println(strList.get(3));

        strList.add("Grapes");

        System.out.println(strList.lastIndexOf("Grapes"));

        strList.remove("PC");

        System.out.println(strList.toString());

        strList.removeAll(vegs);

        System.out.println(strList);

        System.out.println(strList.size());

        strList.set(0, "Raspberry");
        System.out.println(strList.toString());

        System.out.println(strList.subList(2,6).toString());

        strList.sort(Comparator.reverseOrder());

        System.out.println(strList);

        strList.sort(Comparator.naturalOrder());

        System.out.println(strList);

        strList.clear();
        System.out.println(strList.toString());
    }
}
