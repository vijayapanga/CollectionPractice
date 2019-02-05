package javaLearning;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        hs.add("Employee1");
        hs.add("Employee6");
        hs.add("Employee4");
        hs.add("Employee2");
        hs.add("Employee3");
        hs.add("Employee7");
        hs.add("Employee5");

        //adding duplicates - should not take

        hs.add("Employee2");
        hs.add("Employee3");

        // adding Null - only one null accepts
        hs.add(null);
        hs.add(null);


        //Hashset will not have order
        System.out.println(hs);

        // removing
        hs.remove("Employee6");
        hs.remove(null);

        //using Iterator

        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()) {
            System.out.println("Iterator "+iterator.next());
        }

        //using foreach
        for (String hashset : hs) {
            System.out.println("Foreach item "+hashset);
        }


        // Hashset complete clear
        hs.clear();
        System.out.println("After: HashSet contains: "+ hs);




    }
}
