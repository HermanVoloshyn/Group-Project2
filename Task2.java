package GroupProject2;

public class Task2 {
    public static void main(String[] args) {
        // Find out how many alpha characters are present in a string?
        String str = "1234   HeLLo  434^$#$^&@";
        int newStr = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println("Input String: " + str);
        System.out.println("The alpha characters count is : "+newStr);
    }
}
