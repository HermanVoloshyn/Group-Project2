package GroupProject2;

public class Task3 {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For example,
        //given the input "Hello", the output should be "olleH":

        String words = "Hello World";
        String reverseString = Reverse(words);
        System.out.println("String before reverse " + words);
        System.out.println("String after reverse "+ reverseString);

//or:
        System.out.println();
        StringBuilder str1=new StringBuilder("Hello world");
        System.out.println("string after reverse "+str1.reverse());
    }
    private static String Reverse(String input) {
        String str = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            str = str + input.charAt(i);
        }
        return str;
    }
}
