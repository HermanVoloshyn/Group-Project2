package GroupProject2;

import java.util.ArrayList;

public class Task8 {
    /*
  You have a list of strings, and you want to keep only those that start with
“A” and you want to return them in lower case
   */
    public static ArrayList<String> filterStringsStartingWithA(ArrayList<String> inputList) {
        ArrayList<String> result = new ArrayList<>();
        for (String str : inputList) {
            // Check if the string starts with "A" (case-insensitive)
            if (str.toLowerCase().startsWith("a")) {
                // Add the lowercase version of the string to the result list
                result.add(str.toLowerCase());
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Smith");
        inputList.add("Anna");
        inputList.add("John");
        inputList.add("Andrei");
        inputList.add("Jim");
        inputList.add("Amy");


        ArrayList<String> filteredList = filterStringsStartingWithA(inputList);

        System.out.println("Original List: " + inputList);
        System.out.println("Filtered List (lowercase): " + filteredList);
    }
}

