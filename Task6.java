package GroupProject2;

public class Task6 {
    public static void main(String[] args) {
        //Create a method to count how many vowels
        // are present in a string “documentation”
        String input = "Documentation";
        int vowelCount=countVowels(input);
        System.out.println("Number of vowels in the string "+vowelCount);
    }
        public static int countVowels (String str){
        int count = 0;
        for(char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++count;
            }
        }
        return count;
    }}

