package GroupProject2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        // Create an ArrayList with duplicates
        ArrayList<String> originalList = new ArrayList<>();
        List<String> updatedList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        originalList.add("apple");
        originalList.add("grape");
        originalList.add("banana");

        System.out.println("List with duplicates "+originalList);
        //hash doesn't let duplicates:
        Set<String> set=new HashSet<>(originalList);
        updatedList.addAll(set);
        System.out.println("List without duplicates " +updatedList);
    }
}
