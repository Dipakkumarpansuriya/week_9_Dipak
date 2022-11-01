package week_9_HW;

import java.util.ArrayList;
//4. Write a Java program to create a new array list, add some colours (string) and printout the collection
// using for each loop.

public class Pro_4_Colours {


    public static void main(String[] args) {
        Pro_4_Colours obj = new Pro_4_Colours();
        obj.getColours();
    }

    public void getColours() {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("White");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Black");
        colours.add("Purple");

        for (String col : colours) {
            System.out.println(col);

        }
    }
}