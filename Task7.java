package GroupProject2;

public class Task7 {
    public static void main(String[] args) {
        //Count the Number of Words in a String:
        String str = "Hello,  mister... world";
        int count = countWords(str);
        System.out.println("Number of words: " + count);
    }
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        // Using regular expression to split the input string by spaces or punctuation
         //String[] words = str.split(" ");
        String[] words = str.split("\\s+");
        return words.length;
    }
}
