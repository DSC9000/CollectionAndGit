package Collection;

import java.util.*;

public class Set_example {
    public static void main(String[] args) {
        int num =0;
        num = num+1;
        System.out.println(num);
        String str ="abbbatzxxxxxfffffqqqq";
        //arrayList
        List<String>list =new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));
        //[a, b, b, b, a, t, z, x, x, x, x, x, f, f, f, f, f, q, q, q, q]
        System.out.println(list);
       //HashSet
        Set <String>setHash =new HashSet<>(); //takes out duplicates
        setHash.addAll(list);
        System.out.println("setHash takes out duplicates " + setHash);
        //[a, q, b, t, f, x, z]
        //LinkedHash keeps insertion order
        Set<String> setLinked =new LinkedHashSet<>();
        setLinked.addAll(list);
        System.out.println("LinkedHash keeps insertion order "+setLinked);

        //TREE SET
         Set<String> setTree =new TreeSet<>();
         setTree.addAll(list);
        System.out.println(" TreeSet  no null cos it has comparable "+setTree); // this  will be sorted [a, b, f, q, t, x, z]

        //Stack example :




    }
}
