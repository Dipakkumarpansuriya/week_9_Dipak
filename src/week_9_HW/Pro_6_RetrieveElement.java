package week_9_HW;

import java.util.ArrayList;
import java.util.Scanner;
//6. Write a Java program to retrieve an element (at a specified index) from a given array list

public class Pro_6_RetrieveElement {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Yellow");
        list.add("Purple");

        System.out.println(list);
        System.out.print("Please enter index Number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0 || a > 4) {

            System.out.println("Nothing to return at index: " + a);
        } else {
            String element = list.get(a);
            System.out.println("Element at index " + a + " " + element);


        }
    }
}