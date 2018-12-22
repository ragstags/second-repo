package arraylist;

import java.util.HashSet;

/**
 * Created by nadimchouglay on 20/04/2018.
 */
public class Set {
    public static void main(String[] args) {
        //set doesnt permit duplicates
        //array list maintains order of insertion
        //whereas set doesnt care about order
        HashSet<Integer> value = new HashSet<Integer>();
        value.add(19);
        value.add(16);
        value.add(43);
        value.add(16);
        for (Integer val:value){
            System.out.println(val);
        }
        HashSet<String> somecrap = new HashSet<>();
        somecrap.add("random");
        somecrap.add("animal");
        somecrap.add("car");
        somecrap.add("animal");
        for (String var:somecrap){
            System.out.println(var);
        }
        HashSet<Animals> animals = new HashSet<>();
        Animals animals1 = new Animals("Dog",12);
        Animals animals2 = new Animals("cat",3);
        Animals animals3 = new Animals("Bird",2);
        Animals animals4 = new Animals("Dog",12);
        animals.add(animals1);
        animals.add(animals2);
        animals.add(animals3);
        animals.add(animals4);
        System.out.println(animals1.equals(animals4));
        System.out.println(animals1.hashCode());
        System.out.println(animals4.hashCode());
        for (Animals a: animals){
            System.out.println(a);
        }


    }
}
