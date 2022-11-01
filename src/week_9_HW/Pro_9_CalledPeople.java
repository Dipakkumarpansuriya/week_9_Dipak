package week_9_HW;

//9. Create a HashMap object called people that will store String keys and Integer values: And use for each loop to
// iterate the value from Map.

import java.util.*;

public class Pro_9_CalledPeople {


    public static void main(String[] args) {
        Pro_9_CalledPeople obj = new Pro_9_CalledPeople();
        obj.person();
    }

    public void person() {
        Map<String, Integer> persons = new HashMap<String, Integer>();
        persons.put("Andy ", 30);
        persons.put("Brian ", 25);
        persons.put("Charlie", 35);
        persons.put("Dan", 42);


        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
        }

    }

}