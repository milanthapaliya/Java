package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"MT");
        student.put(2,"Xyz");

        // iterating through map using forEach loop

        for(Map.Entry<Integer, String> entry : student.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(Integer key : student.keySet()){
//            System.out.println(key + " " + student.get(key)); // since map is a key value pair
        }

        for(String value : student.values()){
//            System.out.println(value);
        }

        // using Iterator
        Iterator<Map.Entry<Integer,String>> iterator = student.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
//            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        student.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));

        //--------------------------------------------------------------------------------------------
            // sorting elements in a map by value
        student.entrySet().stream().sorted(Comparator.comparing(s -> s.getValue())).forEach(s -> System.out.println(s.getValue()));

            // sorting elements in a map in reverse order
        student.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).forEach(s -> System.out.println(s.getValue()));

        student.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(s -> System.out.println(s.getValue()));


    }
}
