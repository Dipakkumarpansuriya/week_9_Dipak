package week_9_HW;

//5. Write a Java program to iterate through all elements in an array list using  Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Pro_5_Iterator {
    public static void main(String[] args) {
        Pro_5_Iterator obj = new Pro_5_Iterator();
        obj.arrayList();
    }

    public void arrayList() {
        ArrayList<String> element = new ArrayList<String>();
        element.add("Wood");
        element.add("Metal");
        element.add("Water");
        element.add("Fire");
        element.add("Air");
        element.add("Earth");
        Iterator itr = element.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
