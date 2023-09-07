package Collection;

import java.util.*;

public class Set_example {
    public static void main(String[] args) {
        int num =0;
        num = num+1;
        System.out.println(num);
        String str ="abbbatzxxxxxfffffqqqq";

        List<String>list =new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));
        System.out.println(list);
        Set <String>setHash =new HashSet<>(); //takes out duplicates

    }
}
