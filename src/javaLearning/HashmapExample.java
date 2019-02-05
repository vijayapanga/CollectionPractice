package javaLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashmapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer, String>();

        System.out.println(" Is hash map Empty--->"+ hm.isEmpty());

        hm.put(101,"Student1");
        hm.put(108,"Student8");
        hm.put(107,"Student7");
        hm.put(104,"Student4");
        hm.put(103,"Student3");
        hm.put(102,"Student2");
        hm.put(106,"Student6");
        hm.put(105,"Student5");

        System.out.println(" All Entries-->"+ hm);

        //using Iterator
        Set set=hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry mentry= (Map.Entry)iterator.next();
            System.out.println("Key "+mentry.getKey()+" Value "+mentry.getValue());
        }

        hm.remove(108);
        hm.remove(102);

        hm.put(110,"Student10");
        hm.put(109,"Student9");

        System.out.println(hm.size());
        if(hm.containsKey(102))
        {
            System.out.println("student with 102 id present"+hm.containsKey(102)+ " "+hm.containsValue(" Student2"));
        }

        hm.put(109," modified student119");


        String var= hm.get(109);
        System.out.println("Value at index 109 is: "+var);

        System.out.println(" ******* entries after adding and removing ************");
        // Hashmap size
        System.out.println("HashMap sixe-->: " + hm.size());
        System.out.println(hm);

        Set set1=hm.entrySet();
        Iterator iterator1 = set.iterator();
        while(iterator1.hasNext())
        {
            Map.Entry mentry1= (Map.Entry)iterator1.next();
            System.out.println("Key "+mentry1.getKey()+" Value "+mentry1.getValue());
        }

        //Removing Key Pair
        System.out.println("Element removed is: " +hm.remove(109));
        Object remObj=hm.remove(110);
        System.out.println("Element removed is: " +remObj);
        // Hashmap after removing
        System.out.println(hm);

        // Clear all mapping

            hm.clear();
        System.out.println("HashMap Elements: after clear() --> " + hm);


    }
}
